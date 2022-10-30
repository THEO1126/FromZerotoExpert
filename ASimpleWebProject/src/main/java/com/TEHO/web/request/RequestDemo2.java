package com.TEHO.web.request;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.Buffer;

@WebServlet("/requestdemo2")
public class RequestDemo2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        - String getMethod() : 获取请求方式：GET
        String method=req.getMethod();
        System.out.println(method);
//        - String getContextPath() ：获取虚拟目录（项目访问路径）：/FromZerotoExpert
        String contextPath=req.getContextPath();
        System.out.println(contextPath);
//        - StringBuffer getRequestURL()：获取URL（统一资源定位符）：http://localhost:8080/FromZerotoExpert/requestdemo
        StringBuffer url=req.getRequestURL();
        System.out.println(url);
//        - String getRequestURI() ：获取URI（统一资源标识符）：/FromZerotoExpert/requestdemo
        String uri=req.getRequestURI();
        System.out.println(uri);
//        - String getQueryString() ：获取请求参数（GET方式）：username=zhangsan&password=123
        String queryString = req.getQueryString();
        System.out.println(queryString);

//       - String getHeader(String name)：根据请求头名称，获取值
        String agent = req.getHeader("user-agent");
        System.out.println(agent);
//       - ServletInputStream getIuputStream() ：获取字节输入流

//       - BufferedReader getReader() ：获取字符输入流
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取post：请求体：请求参数
        // 1. 获取字符输入流
           // - BufferedReader getReader() ：获取字符输
        BufferedReader br= req.getReader();
        // 2. 读取数据
        String line = br.readLine();
        System.out.println(line);
    }
}
