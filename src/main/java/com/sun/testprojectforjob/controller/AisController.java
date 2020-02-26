package com.sun.testprojectforjob.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.sun.testprojectforjob.entity.User;
import com.sun.testprojectforjob.service.StudentService;
import org.apache.ibatis.jdbc.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
@RequestMapping("/ais")
public class AisController {
    @Autowired
    private StudentService studentService;
    @RequestMapping("/login")
    public String login(){
        return "ais_login";
    }
    @RequestMapping("/angular")
    public String angular(){
        return "hello_angular";
    }
    @RequestMapping("/sendData")
    @ResponseBody
    public void sendData(HttpServletResponse response, HttpServletRequest request, HttpSession session) throws IOException {
        String str=request.getParameter("mydata");
        User user=studentService.getUser("swp");
        System.out.println("====="+str);
        PrintWriter printWriter= null;
        response.setContentType("text/html;charset=utf-8");

        if (printWriter ==null){
            printWriter=response.getWriter();
            printWriter.flush();
        }
        if(printWriter!=null){
            System.out.println("===pw is not null");
            printWriter.print(user);
            printWriter.close();
        }
//        return ;
    }
}
