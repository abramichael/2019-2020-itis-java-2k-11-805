import sun.misc.Request;

import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String name = request.getParameter("name");
        response.setContentType("text/html");

        request.setAttribute("yourname", name);

        RequestDispatcher rd = request.getRequestDispatcher("/show_hello");
        rd.forward(request, response);


    }
}
