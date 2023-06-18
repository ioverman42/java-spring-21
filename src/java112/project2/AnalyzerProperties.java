package java112.project2;

import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import java112.utilities.PropertiesLoader;

/**
 * Web servlet for analyzer project properties
 * @author iaoverman
 */
@WebServlet(
    name = "propertiesServlet",
    urlPatterns = { "/properties" }
)

/**
 * analyzer properties class
 */
public class AnalyzerProperties extends HttpServlet implements PropertiesLoader{
    private Properties properties;

    /**
     * init method for analyzerproperties servlet
     */
    public void init() {
       try {
           properties = loadProperties("/analyzer.properties");
       } catch (Exception exception) {
           System.out.println("There was a problem");
           exception.printStackTrace();
       }

    }

   /**
    * doGet method for this servlet
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
        out.print("<HEAD><TITLE>Properties Servlet</TITLE></HEAD>");
        out.print("<BODY>");
        out.print("<h1>Properties Servlet</h1>");
        out.print("<a href='/java112'>Home</a><br /><br />");

        out.print("<table><TR><TH>Key</TH><TH>Contents</TH></TR>");
        out.print("<TR><TD>Project Name</TD><TD>" + properties.getProperty("project.name") + "</TD></TR>");
        out.print("<TR><TD>Author</TD><TD>" + properties.getProperty("author.name") + "</TD></TR>");
        out.print("<TR><TD>Author Email</TD><TD>" + properties.getProperty("author.email.address") + "</TD></TR>");
        out.print("<TR><TD>Course</TD><TD>" + properties.getProperty("course.title") + "</TD></TR>");
        out.print("<TR><TD>Course Type</TD><TD>" + properties.getProperty("course.type") + "</TD></TR>");
        out.print("<TR><TD>Instructor</TD><TD>" + properties.getProperty("instructor.name") + "</TD></TR>");
        out.print("<TR><TD>Project Description</TD><TD>" + properties.getProperty("project.description") + "</TD></TR>");
        out.print("</TABLE>");
        out.print("</BODY>");
        out.print("</HTML>");
        out.close();
   }
}
