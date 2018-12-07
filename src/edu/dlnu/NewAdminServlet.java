package edu.dlnu;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet(name = "NewAdminServlet",urlPatterns = "/newadmin")
public class NewAdminServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String uname = request.getParameter("username");
        String userpwd = request.getParameter("userpwd");


        try {
            Connection connection = JdbcUtils.getConnection();
            PreparedStatement st = connection.prepareStatement("insert  into user values (?,?)");
            st.setString(1,uname);
            st.setString(2,userpwd);
            int result = st.executeUpdate();
            if (result>0){
                System.out.println("注册成功!!");
                response.sendRedirect("/loginview");
            }else{
                System.out.println("注册失败!!");
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
        request.getRequestDispatcher("WEB-INF/main.jsp").forward(request,response);

    }
}
