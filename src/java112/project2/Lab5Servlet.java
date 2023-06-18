package java112.project2;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.util.Date;

/**
 * Lab 5 practicing with basic servlet layout.
 * @author iaoverman
 */
 @WebServlet(
     name = "Lab5Servlet",
     urlPatterns = { "/lab5" }
 )
public class Lab5Servlet extends HttpServlet {
    //override init method
    public void init() throws ServletException {
        //Initialization code
        log("init method executed");
    }

    // The main servlet method
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        // set the response type before sending data
        PrintWriter  out  = response.getWriter();

        out.print("<HTML>");
        out.print("<HEAD><TITLE>Lab 5 Output</TITLE></HEAD>");
        out.print("<BODY>");
        out.print("<h1>Lab 5</h1>");
        out.print("<a href='/java112'>Home</a><br />");

        //hit counter with sessions
        HttpSession session = request.getSession();   // this is how to get a session object
        Integer hitNumber = (Integer) session.getAttribute("count");  // retrieving value from session object
        String head;
        if (hitNumber == null) {
          hitNumber = Integer.valueOf(1);
          head = "This is the New Session";
        } else {
          hitNumber = Integer.valueOf(hitNumber.intValue()+1);
          head = "This is the old Session";
        }
        session.setAttribute("count", hitNumber); // storing the value with session object
        //out.println("Your Session ID:  " + session.getId());  // never changes in the whole session
        //out.println("Session Creation Time: " + new Date(session.getCreationTime())); // never changes in the whole session
        //out.println("Time of Last Access: " + new Date(session.getLastAccessedTime()));   // changes for every hit
        out.println("<br />Latest Hit Count: " + hitNumber);      // increments by 1 for every hit

        Date sessionCreationDate = new Date(session.getCreationTime());
        Date nowsDate = new java.util.Date();

        out.println("<H2>" + head + "</H2>\n" +
                "<TABLE BORDER=1>\n" +
                "<TR BGCOLOR=\"#FFAD00\">\n" +
                "  <TH>Information Type<TH>Data\n" +
                "<TR>\n" +" <TD>Total Session Accesses\n" +
                "<TD>" + hitNumber + "</td></tr>\n" +
                "<tr><td>First Access Time</td>" +
                "<td>" + sessionCreationDate + "</td>" +
                "<tr><td>Current Date</td>" +
                "<td>" + nowsDate + "</td>" +
                "<tr><td>Question 5</td>" +
                "<td>The log()s didn't show up.</td>" +
                "<tr><td>Question 7</td>" +
                "<td>This time the log()s show up.</td>" +
                "</TABLE>\n");

        //out.print("<h2>"+"Current Date & Time: " + nowsDate.toString()+"</h2>");

        out.print("</BODY>");
        out.print("</HTML>");
        out.close();

        log("doGet method executed");
    }
}
