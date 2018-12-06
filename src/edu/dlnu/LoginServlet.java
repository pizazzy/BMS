package edu.dlnu;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet",urlPatterns ="/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String uname = request.getParameter("uname");
        String pwd = request.getParameter("pwd");

        //2.判断用户输入的内容是否有效
        if ("root".equals(uname) && "1234".equals(pwd)) {
            System.out.println("登陆成功! ");
            //可以使用请求转发继续跳转页面
            //使用重定向,返回主页
            response.sendRedirect("/home");
        } else {
            System.out.println("登录失败!");

            request.setAttribute("msg", "用户名或密码错误");

            //转发到登录失败页面
            request.getRequestDispatcher("/WEB-INF/error.jsp").forward(request, response);


        }

    }
}