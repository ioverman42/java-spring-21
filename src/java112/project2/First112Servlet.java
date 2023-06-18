package java112.project2;

import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

/**
 * basic webservlet for advanced java
 * @author iaoverman
 */
@WebServlet(
    name = "first112servlet",
    urlPatterns = { "/first" }
)

/**
 * webservlet class
 */
public class First112Servlet extends HttpServlet {
    /**
     * doGet for basic web servlewt
     * @param  request          request
     * @param  response         response
     * @throws ServletException servlet exception
     * @throws IOException      IO exception 
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter  out  = response.getWriter();
         out.print("<HTML>");
         out.print("<HEAD><TITLE>First Servlet</TITLE></HEAD>");
         out.print("<BODY>");
         out.print("<h1>First Servlet</h1>");
         out.print("<a href='/java112'>Home</a><br /><br />");
         out.print("<h3>Isabel Overman</h3>");
         out.print("<h3>Advanced Java (Java 112)</h3>");
         out.print("<br/><br />");
         out.print("<img src=\"images/sleepytarrasque.png\" alt=\"lovely sleeping tarrasque\"/>");
         out.print("");
         out.print("");
         out.print("");
         out.close();
     }
}
