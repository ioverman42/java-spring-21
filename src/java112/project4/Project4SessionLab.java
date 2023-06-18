package java112.project4;

import java.io.*;
import java.util.*;
import java112.employee.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

/**
 *  This is part of module 4 and demonstrates
 *  getting and setting attributes in the session.
 *
 *@author    iaoverman
 */
@WebServlet(
    name = "project4SessionCounter",
    urlPatterns = { "/session-counter" }
)
public class Project4SessionLab extends HttpServlet {

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

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        HttpSession session = request.getSession();

        //int sessionCounter;
        Integer project4SessionCounter = (Integer) session.getAttribute("project4SessionCounter");
        Integer sessionCounter = (Integer) session.getAttribute("project4SessionCounter");

        if (sessionCounter == null) {
            session.setAttribute("project4SessionCounter", 1);
        } else {
            sessionCounter = sessionCounter + 1;
            session.setAttribute("project4SessionCounter", sessionCounter);
        }

        //Create the url
        String url = "/project4Session.jsp";

        //Forward to jsp page
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);

    }
}
