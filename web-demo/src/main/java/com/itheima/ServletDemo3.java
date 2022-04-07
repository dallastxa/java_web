package com.itheima;


import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(value = "/demo3",loadOnStartup = 1)
public class ServletDemo3 implements Servlet {
    private ServletConfig config;
    /*
    *
    * 初始化方法
    * 1.调用时机：默认情况下，Servlet被第一次访问时，调用
    *       * loadOnStartup
    * 2.调用次数：1次
    * */
    public void init(ServletConfig servletConfig) throws ServletException {
        this.config=servletConfig;
        //System.out.println("init...");
    }


    /*
    * 提供服务
    * 1.调用时机：每一次Servlet被访问时，调用
    * 2.调用次数：多次
    * */
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        //System.out.println("servlet hello world~");
    }

    /*
    * 销毁方法
    * 1.调用时机：内存释放或者服务器关闭的时候，Servlet对象会被销毁，调用
    * 2.调用次数：1
    * */
    public void destroy() {
        System.out.println("destroy");
    }

    public String getServletInfo() {
        return null;
    }

    public ServletConfig getServletConfig() {
        return config;
    }
}
