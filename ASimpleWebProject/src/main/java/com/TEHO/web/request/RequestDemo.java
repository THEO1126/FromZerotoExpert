package com.TEHO.web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/requestdemo")
public class RequestDemo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 使用 request 对象 获取请求数据
        String name = req.getParameter("name"); //url?name=zhangsan

        // response 设置响应数据
        // 设置响应头
        resp.setHeader("content-type","text/html;charset=utf-8");
        // 设置响应消息请求数据
        resp.getWriter().write("<h1>"+name+"欢迎你！</h1>");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("post...");
    }
}
