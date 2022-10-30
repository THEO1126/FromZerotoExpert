package com.TEHO.web.response;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

// 重定向
@WebServlet("/responsedemo1")
public class ResponseDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("responsedemo1..");

//        // 方法一：
//        // 1. 设置响应状态码
//        response.setStatus(302);
//        // 2. 设置响应头 location
//        response.setHeader("location","/FromZerotoExpert/responsedemo2");
        //方法二：
//        response.sendRedirect("https://www.baidu.com/");
        // response.sendRedirect("/FromZerotoExpert/responsedemo2");
        // response.sendRedirect("https://www.baidu.com/");

        // 动态获取虚拟目录完成重定向
        String contextpath=request.getContextPath();
        response.sendRedirect(contextpath+"/responsedemo2");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
