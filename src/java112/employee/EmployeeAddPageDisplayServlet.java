package java112.project4;

import java.io.*;
import java.util.*;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

/**
 *  This class forwards to the Employee Add jsp.
 *
 *  @author iaoverman
 */
@WebServlet(
    name = "EmployeeAddPageDisplay",
    urlPatterns = { "/add-display" }
)
public class EmployeeAddPageDisplayServlet extends HttpServlet {

    /**
     *  Handles HTTP GET requests.
     *
     *@param  request               the HttpRequest
     *@param  response              the HttpResponse
     *@exception  ServletException  if there is a general
     *                              servlet exception
     *@exception  IOException       if there is a general
     *                              I/O exception
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //Create the url
        String url = "/employeeAdd.jsp";

        //Forward to jsp page
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
}
