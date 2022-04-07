package com.itheima;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class ServletDemo5 implements Servlet {
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    public ServletConfig getServletConfig() {
        return null;
    }

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        // 根据请求方式的不同，进行分别的处理
        HttpServletRequest request=(HttpServletRequest) servletRequest;
        //1.获取请求方式
        String method=request.getMethod();
        //2.判断
        if ("GET".equals(method)){
            //get方式的处理逻辑
        }else if("POST".equals(method)){
            //post方式的处理逻辑
        }

    }

    public String getServletInfo() {
        return null;
    }

    public void destroy() {

    }
}
