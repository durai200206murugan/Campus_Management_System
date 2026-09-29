package campus.controller;

import com.campus.services.StudentService;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/students")
public class StudentServlet  extends HttpServlet {

        private final StudentService studentService = new StudentService();

        @Override 
        public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<html>");
            out.println("<head><title>List of Students</title></head>");
            out.println("<body>");
            out.println("<h1>All Students</h1>");
            out.println("<ul>");
            for (String student : studentService.getStudents()) {
                out.println("<li>" + student+ "</li>");

            }
            out.println("</ul>");
            out.println("<a href=\"/Student.html\">Add New Student</a>");
            out.println("</body>");
            out.println("</html>");
        }

}

