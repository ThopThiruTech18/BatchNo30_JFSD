package in.thiru;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/edit")
public class EditStudentServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = 
                con.prepareStatement("SELECT * FROM student WHERE id=?");

            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                out.println("<form action='update' method='post'>");
                out.println("<input type='hidden' name='id' value='" + rs.getInt("id") + "'/>");
                out.println("Name: <input type='text' name='name' value='" + rs.getString("name") + "'/><br>");
                out.println("Email: <input type='text' name='email' value='" + rs.getString("email") + "'/><br>");
                out.println("Course: <input type='text' name='course' value='" + rs.getString("course") + "'/><br>");
                out.println("<input type='submit' value='Update'/>");
                out.println("</form>");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
