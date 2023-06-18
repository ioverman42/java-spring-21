package java112.project4;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import java112.employee.*;
import java112.utilities.PropertiesLoader;

/**
 * Prep for running the web app. Sets up properties and EmployeeDirectory instance.
 * @author iaoverman
 */
@WebServlet(
    name = "applicationStartup",
    urlPatterns = { "/project4-startup" },
    loadOnStartup = 1
)

public class ApplicationStartup extends HttpServlet implements PropertiesLoader {
    private Properties properties;

    /**
     * Init method for project4.
     * @throws ServletException [description]
     */
    public void init() throws ServletException {
        try {
            properties = loadProperties("/project4.properties");
        } catch (Exception exception) {
            System.out.println("There was a problem with the properties.");
            exception.printStackTrace();
        }

        ServletConfig sConfig = getServletConfig();

        ServletContext sc = sConfig.getServletContext();

        sc.setAttribute("project4Properties", properties);

        Properties passTheseProperties = (Properties) sc.getAttribute("project4Properties");
        System.out.println("PROPERTIES PL APPSTART: " + passTheseProperties.getProperty("driver")); //works

        EmployeeDirectory employeeDirectory = new EmployeeDirectory(passTheseProperties);

        sc.setAttribute("employeeDirectory", employeeDirectory);

    }
}
