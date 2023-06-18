package java112.project4;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

/**
 *  Demonstrating JSTLs
 *  @author iaoverman
 */
@WebServlet(
    name = "jstlLab1",
    urlPatterns = { "/jstlLab" }
)
public class JSTLLab1Servlet extends HttpServlet {

    /**
     * Create Dinosaurs
     * @param  request          [description]
     * @param  response         [description]
     * @throws ServletException [description]
     * @throws IOException      [description]
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response)
             throws ServletException, IOException {

        HttpSession  session  = request.getSession();

        List dinosaurs = new ArrayList();
        dinosaurs.add("T-Rex");
        dinosaurs.add("Triceratops");
        dinosaurs.add("Pterodactyl");
        dinosaurs.add("Pteranodon");
        dinosaurs.add("Pachycephalosaurus");

        session.setAttribute("dinosaurList", dinosaurs);

        //Create the url
        String url = "/jstl-lab2.jsp";

        //Forward to jsp page
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);


    }
}
