package java112.project4;

import java.io.*;
import java.util.*;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import java112.employee.*;

/**
 * Calls search method and send user to results page.
 * @author iaoverman
 */
@WebServlet(
    name = "searchResutlsServlet",
    urlPatterns = { "/results" }
)
public class EmployeeSearchResultsServlet extends HttpServlet {
    /**
     * Handles HTTP Get requests
     * @param  request          [description]
     * @param  response         [description]
     * @throws ServletException if there is a servlet failure
     * @throws IOException      if there is an IO failture
     */
    public void doGet(HttpServletRequest request,
            HttpServletResponse response) throws
            ServletException, IOException {

        ServletConfig sConfig = getServletConfig();
        ServletContext sc = sConfig.getServletContext();

        EmployeeDirectory employeeDirectory = (EmployeeDirectory) sc.getAttribute("employeeDirectory");

        Properties properties = (Properties) sc.getAttribute("project4Properties");
        log("PROPERTIES TEST AFTER LOADING PROPS: " + properties.getProperty("driver")); //works

        String searchTerm = request.getParameter("searchTerm");
        log("search term: " + searchTerm);

        String searchType = request.getParameter("searchType");
        log("search type: " + searchType);

        Search searchResults = employeeDirectory.searchEmployeeDatabase(searchTerm, searchType);

        HttpSession session = request.getSession();

        session.setAttribute("searchResults", searchResults);
        session.setAttribute("resultsList", searchResults.getResultsList())
;
        //Create the url
        String url = "/employeeSearchResults.jsp";

        //Forward to jsp page
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
}
