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
    name = "createFlowers",
    urlPatterns = { "/flowers" }
)
public class CreateFlowers extends HttpServlet {

    /**
     * Create Flowers
     * @param  request          [description]
     * @param  response         [description]
     * @throws ServletException [description]
     * @throws IOException      [description]
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response)
             throws ServletException, IOException {

        HttpSession  session  = request.getSession();

        List flowers = new ArrayList();
        flowers.add("Tulip");
        flowers.add("Rose");
        flowers.add("Daffodil");
        flowers.add("Petunia");
        flowers.add("Lily");

        session.setAttribute("flowersList", flowers);


    }
}
