package com.TEHO.web.response;

import org.apache.commons.io.IOUtils;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

// 获取字节输出流
@WebServlet("/responsedemo4")
public class ResponseDemo4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1. 读取文件
        FileInputStream fis=new FileInputStream("D:\\program\\Java\\source\\pic.jpg");
        // 2. 获取response字节输出流
        ServletOutputStream os =response.getOutputStream();
        // 3. 完成流的copy
            /*  byte[] buff = new byte[1024];
            int len=0;
            while ((len=fis.read(buff))!=-1){
                os.write(buff,0,len);
            }*/
        IOUtils.copy(fis,os); // 用工具commons-io
        fis.close();
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
