package com.TEHO.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

@WebServlet("/ServletDemo")
public class ServletDemo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username=request.getParameter("username");
//        // 解决GET中文乱码
//        // get获取参数的方式：getQueryString
//        // 乱码原因：tomcat进行URL编码，默认的字符集为ISO-8859-1
//        // 1.对乱码进行编码：转为字节数组
//        byte []bytes=username.getBytes("ISO-8859-1");
//        // 2. 将字符数组转换成字符串（字符数组解码）
//        String s=new String(bytes,StandardCharsets.UTF_8);
        String s=new String(username.getBytes(StandardCharsets.ISO_8859_1),StandardCharsets.UTF_8);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 解决POST中文乱码
        // POST .getReader()
        request.setCharacterEncoding("UTF-8");//设置字符输入流的编码
        // 1.获取username
        String username=request.getParameter("username");
        System.out.println("username:"+username);
        this.doGet(request, response);
    }
}
