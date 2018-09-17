/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 687159
 */
public class arithmeticCalculatorServlet extends HttpServlet 
{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        String firstNumber = request.getParameter("firstN");
        String secondNumber = request.getParameter("secondN");
        
        if(firstNumber == null && secondNumber == null)
        {
            request.setAttribute("resultM", "Reult: ---");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
            return;
        }
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        String firstNumber = request.getParameter("firstN");
        String secondNumber = request.getParameter("secondN");
        String operation = request.getParameter("operation");
   
        int finalResult=0;
        //boolean calcPerformed=false;
    
        if (operation!=null)
        {
            if (firstNumber!=null && secondNumber!=null && !firstNumber.equals("") && !secondNumber.equals(""))
            {   
                try
                {
                    int first = Integer.parseInt(firstNumber);
                    int second = Integer.parseInt(secondNumber);
                    char operationType = operation.charAt(0);
            
                    switch (operationType)
                    {
                        case '+': finalResult = first + second;
                        request.setAttribute("resultM", "Reult = " + finalResult);
                        break;
                        case '-': finalResult = first - second;
                        request.setAttribute("resultM", "Reult = " + finalResult);
                        break;
                        case '*': finalResult = first * second;
                        request.setAttribute("resultM", "Reult = " + finalResult);
                        break;
                        case '%': finalResult = first % second;
                        request.setAttribute("resultM", "Reult = " + finalResult);
                        break;
                    }
                    //calcPerformed = true;
                }
                catch(NumberFormatException e)
                {
                    request.setAttribute("resultM", "Reult: Invalid, please enter digits only.");
                    getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
                    return;
                }
                    
            }
            else
            {
                request.setAttribute("resultM", "Reult: Invalid");
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
                return;
            }    
        }
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);    
    }
}
