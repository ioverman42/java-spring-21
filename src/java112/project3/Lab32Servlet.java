package java112.project3;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

/**
 *  This is part of a lab and is the first servlet for the course.
 *
 *@author    iaoverman
 */
@WebServlet(
    name = "lab32",
    urlPatterns = { "/Lab32" }
)
public class Lab32Servlet extends HttpServlet {

    /**
     *  Handles HTTP GET requests.
     *
     *@param  request                   the HttpServletRequest object
     *@param  response                   the HttpServletResponse object
     *@exception  ServletException  if there is a Servlet failure
     *@exception  IOException       if there is an IO failure
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

            PrintWriter out = response.getWriter();
            out.print("<HTML>");
            out.print("<HEAD><TITLE>Sample Output</TITLE></HEAD>");
            out.print("<BODY>");
            out.print("<h1>Lab 3-2</h1>");
            out.print("<table><tr><td>Locale</td><td>");
            out.print(request.getLocale());
            out.print("</td></tr><tr><td>Context Path</td><td>");
            out.print(request.getContextPath());
            out.print("</td></tr><tr><td>Local Name</td><td>");
            out.print(request.getLocalName());
            out.print("</td></tr><tr><td>Scheme</td><td>");
            out.print(request.getScheme());
            out.print("</td></tr></table>");
            out.print("</BODY>");
            out.print("</HTML>");
            out.close();

    }

}
