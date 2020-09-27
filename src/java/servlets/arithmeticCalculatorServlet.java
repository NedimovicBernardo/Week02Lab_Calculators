
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
public class arithmeticCalculatorServlet extends HttpServlet 
{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        
        request.setAttribute("message", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        String firstNum = request.getParameter("first_number");
        String secondNum = request.getParameter("second_number");
        
        request.setAttribute("firstNumber", firstNum);
        request.setAttribute("secondNumber", secondNum);
        
        if(firstNum == null || firstNum.equals("") || secondNum == null || secondNum.equals(""))
        {
           request.setAttribute("message", "invalid");
            
           getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
           return;
        }
        for (int a = 0; a < firstNum.length(); a++) 
        {
            char character = firstNum.charAt(a);
            if (Character.isLetter(character)) 
            {
                request.setAttribute("message", "invalid");
            
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
                return;
            }
        }
        for (int a = 0; a < secondNum.length(); a++) 
        {
            char character = secondNum.charAt(a);
            if (Character.isLetter(character)) 
            {
                request.setAttribute("message", "invalid");
            
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
                return;
            }
        }
        
        int FirstN = Integer.valueOf(firstNum);
        int SecondN = Integer.valueOf(secondNum);
        
     
        if(request.getParameter("plus") != null)
        {
            request.setAttribute("message", FirstN + SecondN);
            
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
            return;
        }
        if(request.getParameter("minus") != null)
        {
            request.setAttribute("message", FirstN - SecondN);
            
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
            return;
        }
        if(request.getParameter("multiply") != null)
        {
            request.setAttribute("message", FirstN * SecondN);
            
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
            return;
        }
        if(request.getParameter("modulus") != null)
        {
            request.setAttribute("message", FirstN % SecondN);
            
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
            return;
        }
    }


}
