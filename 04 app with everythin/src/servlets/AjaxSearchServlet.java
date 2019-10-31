package servlets;

import dao.StudentDAOImpl;
import models.Student;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AjaxSearchServlet extends HttpServlet {
    private StudentDAOImpl studentDAO;

    @Override
    public void init() {
        studentDAO = new StudentDAOImpl();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String query = request.getParameter("query");

        List<Student> students = studentDAO.getByLikePattern(query);

        JSONArray ja = new JSONArray();
        for (Student student: students) {
            ja.put(new JSONObject(student));
        }
        JSONObject jo = new JSONObject();
        jo.put("objects", ja);

        response.setContentType("text/json");
        response.getWriter().write(jo.toString());

    }
}
