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
public class HelloWorldServlet extends HttpServlet 
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        getServletContext().getRequestDispatcher("/WEB-INF/helloWorldJSP.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        String fName = request.getParameter("fname");
        String lName = request.getParameter("lname");
        
        if(fName == null || fName.equals("") || lName == null || lName.equals(""))
        {
            request.setAttribute("errorM", "Please fill in the form");
            getServletContext().getRequestDispatcher("/WEB-INF/helloWorldJSP.jsp").forward(request, response);
            return;
        }
        request.setAttribute("firstName", fName);
        request.setAttribute("lastName", lName);
        
        
        getServletContext().getRequestDispatcher("/WEB-INF/sayHello.jsp").forward(request, response);
    }
}
