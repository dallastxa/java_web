package com.itheima.web.request;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/req4")
public class RequestDemo4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);

        String username=req.getParameter("username");
/*        System.out.println(username);
        byte[] bytes=username.getBytes("ISO-8859-1");
        username=new String(bytes,"UTF-8");
        System.out.println(username);*/
        //先编码再解码
        username=new String(username.getBytes("ISO-8859-1"),"UTF-8");
        System.out.println(username);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
        req.setCharacterEncoding("UTF-8");
    }
}
