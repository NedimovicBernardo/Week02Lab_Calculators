
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 816076
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
        String currentAge = request.getParameter("age");
         
        request.setAttribute("Age", currentAge);
         
        if(currentAge == null || currentAge.equals(""))
        {
           request.setAttribute("message", "You must give your current age.");
            
           getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
           return;
        }
        for (int a = 0; a < currentAge.length(); a++) 
        {
            char character = currentAge.charAt(a);
            if (Character.isLetter(character)) 
            {
                request.setAttribute("message", "You must enter a number.");
            
                getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
                return;
            }
        }
        
        int currentAgeInteger = Integer.valueOf(currentAge);
        
        request.setAttribute("message", "Your age next birthday will be " + ++currentAgeInteger);
            
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
    }

}
