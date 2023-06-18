package java112.labs3;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

/**
 *  This is the sevlet for question 2 on the midterm exam.
 *
 *  Write a full servlet class, including a doGet() method,
 *  in a servlet named, "HelloWorldServlet" that simply outputs
 *  "Hello World!" to the browser. Include the full method header,
 *  setting the content type, and accessing and using the Printwriter
 *  object associated with the browser. Write the servlet and the java
 *  annotations which configure the servlet.
 *
 *  @author iaoverman
 */
@WebServlet(
    name = "question2",
    urlPatterns = { "/question2", "/HelloWorld" }
)
public class HelloWorldServlet extends HttpServlet {

    /**
     *  Handles HTTP GET requests.
     *
     *@param  request the HttpServletRequest object
     *@param  response the HttpServletResponse object
     *@exception  ServletException if there is a Servlet failure
     *@exception  IOException if there is an IO failure
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.print("<HTML>");
        out.print("<HEAD><TITLE>HelloWorldServlet</TITLE></HEAD>");
        out.print("<BODY>");
        out.print("<h1>Hello World!</h1>");
        out.print("<br /><a href='/java112'>Home</a><br />");

    }

}
