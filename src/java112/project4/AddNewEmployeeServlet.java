package java112.project4;

import java.io.*;
import java.util.*;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import java112.employee.*;

/**
 * Calls add new employee method and sends user to results page.
 * @author iaoverman
 */
@WebServlet(
    name = "addNewEmployee",
    urlPatterns = { "/addNewEmployee" }
)
public class AddNewEmployeeServlet extends HttpServlet {
    /**
     * Handles HTTP Get requests
     * @param  request          [description]
     * @param  response         [description]
     * @throws ServletException if there is a servlet failure
     * @throws IOException      if there is an IO failture
     */
    public void doPost(HttpServletRequest request,
            HttpServletResponse response) throws
            ServletException, IOException {

        ServletConfig sConfig = getServletConfig();
        ServletContext sc = sConfig.getServletContext();

        EmployeeDirectory employeeDirectory = (EmployeeDirectory) sc.getAttribute("employeeDirectory");

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String ssn = request.getParameter("ssn");
        String department = request.getParameter("department");
        String roomNumber = request.getParameter("roomNumber");
        String phone = request.getParameter("phone");

        log(firstName + lastName + ssn + department + roomNumber + phone);

        employeeDirectory.addNewEmployee(firstName, lastName, ssn, department,
                roomNumber, phone);

        HttpSession session = request.getSession();
        session.setAttribute("project4AddMessage", "Success! You added employee "
                + firstName + " " + lastName + ".");



        //Create the url
        String url = "/java112/employeeAdd.jsp";
        // Redirect to JSP page
        response.sendRedirect(url);


    }
}
