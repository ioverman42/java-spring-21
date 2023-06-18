package java112.project4;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

/**
 *  This class demonstrates getting input fields from an HTML form
 *
 *@author    iaoverman
 */
@WebServlet(
    name = "lab41",
    urlPatterns = { "/lab41" }
)
public class Lab41Servlet extends HttpServlet {

    /**
     *  Handles HTTP GET requests.
     *
     *@param  request               Description of the Parameter
     *@param  response              Description of the Parameter
     *@exception  ServletException  if there is a Servlet failure
     *@exception  IOException       if there is an IO failure
     */
    public void doGet(HttpServletRequest request,
            HttpServletResponse response)
        throws ServletException, IOException {

        String  text1 = request.getParameter("text1");

        log("text1: " + text1);

        String  vaccine = request.getParameter("vaccine");

        log("vaccine: " + vaccine);

        PrintWriter writer = response.getWriter();
        writer.println(text1);
        writer.println(vaccine);
    }
}
