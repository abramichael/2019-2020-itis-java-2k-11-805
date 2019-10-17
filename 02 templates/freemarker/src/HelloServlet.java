import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;
import sun.misc.Request;

import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HelloServlet extends javax.servlet.http.HttpServlet {

    @Override
    public void init() {
        Configuration cfg = new Configuration(Configuration.VERSION_2_3_22);
        cfg.setServletContextForTemplateLoading(getServletContext(),
                "/WEB-INF/templates/");
        cfg.setTemplateExceptionHandler(TemplateExceptionHandler.HTML_DEBUG_HANDLER);
        getServletContext().setAttribute("cfg", cfg);
    }


    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String name = request.getParameter("name");
        response.setContentType("text/html");
        Map<String, Object> root = new HashMap<>();
        List<String> greetings = new ArrayList<>();
        greetings.add("Hello");
        greetings.add("Hi");
        greetings.add("Hola");

        root.put("name", name);
        root.put("greetings", greetings);
        Helpers.render(request, response, "hello.ftl", root);


    }
}
