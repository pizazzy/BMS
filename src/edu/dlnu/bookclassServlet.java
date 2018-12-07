package edu.dlnu;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "bookclassServlet",urlPatterns = "/bookclass")
public class bookclassServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        tushuleibie_dao tushuleibie_dao = new tushuleibie_dao();
        List<tushuleibie> ALLtuhuleibie = tushuleibie_dao.getALLtuhuleibie();

        request.setAttribute("ulist" ,ALLtuhuleibie);
        request.getRequestDispatcher("WEB-INF/bookclass.jsp").forward(request,response);
    }
}
