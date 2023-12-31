package java112.project4;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

/**
 *  This class demonstrates getting input fields from an HTML form
 *
 *@author    eknapp
 */
@WebServlet(
    name = "requestParam",
    urlPatterns = { "/request-params" }
)
public class RequestParameterSample extends HttpServlet {

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

        String  param1 = request.getParameter("param1");

        System.out.println("param1: " + param1); //ends up in the server log, not great
        //instead, use
        log("param1: " + param1); //which ends up in the localhost log 

        String  param2 = request.getParameter("param2");

        log("param2: " + param2);
    }
}
