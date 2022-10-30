package com.TEHO.web.request;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet("/requestdemo3")
public class RequestDemo3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // get请求逻辑
        System.out.println("demo3...");
        System.out.println("get...");

//        // 1. 获取所有集合参数的map集合
//        Map<String,String[]> map=req.getParameterMap();
//        for (String key : map.keySet()) {
//            System.out.print(key+":");
//            //获取值
//            String[] values=map.get(key);
//            for (String value : values) {
//                System.out.print(value+" ");
//            }
//            System.out.println();
//        }
//
//        // 2. 根据key获取参数值，数组
//        String[] hobbies=req.getParameterValues("hobby");
//        for (String hobby : hobbies) {
//            System.out.println(hobby);
//        }
//
//        // 3. 根据key获取单个参数值
//        String username=req.getParameter("username");
//        String password=req.getParameter("password");
//        System.out.println("username:"+username);
//        System.out.println("password:"+password);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // post请求逻辑
        System.out.println("post...");
        doGet(req,resp);
    }
}
