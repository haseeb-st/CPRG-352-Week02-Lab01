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
public class ageCalculatorServlet extends HttpServlet 
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        String age = request.getParameter("ageBox");
        request.setAttribute("ageBox", age);
        
        if (age == null || age.equals(""))
        {
            request.setAttribute("errorMessage", "You must give your current age");
            getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
            return;
        }
        else
        {
            try
            {
                int newAge = Integer.parseInt(request.getParameter("ageBox"));
                newAge = newAge + 1;
                request.setAttribute("ageMessage", "You will be " + newAge + " on your next birthday");
                getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
            }
            catch(NumberFormatException e)
            {
                request.setAttribute("errorMessage", "You must enter digits");
                getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
                return;
            }
            
        }
    }
}
