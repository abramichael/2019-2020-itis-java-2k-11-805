import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;

import javax.print.attribute.standard.RequestingUserName;
import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HelloServlet extends javax.servlet.http.HttpServlet {

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String name = request.getParameter("name");

        Map<String, Object> root = new HashMap<>();
        List<String> greetings = new ArrayList<>();
        greetings.add("Hello");
        greetings.add("Hola");
        greetings.add("Ciao");
        root.put("name", name);
        root.put("greetings", greetings);

        response.setContentType("text/html");
        Helpers.render(request, response, "hello.ftl", root);
    }
}
