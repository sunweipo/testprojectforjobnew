package com.sun.testprojectforjob.controller;

import com.sun.testprojectforjob.StudentProperties;
import com.sun.testprojectforjob.entity.Student;
import com.sun.testprojectforjob.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class HelloTestController {
//    @Value("${name}")
//    private String name;
//    @Value("${age}")
//    private Integer age;
    @Autowired
    private StudentProperties studentProperties;
    @Autowired
    private StudentService studentService;

    @RequestMapping("/hello")
    public String hello(Model m){
        m.addAttribute("now", new SimpleDateFormat("HH:mm:ss").format(new Date()));
        System.out.println("==="+new SimpleDateFormat("HH:mm:ss").format(new Date()));
        Student student=studentService.Sel(1);
        System.out.println(student.toString());
        m.addAttribute("student",student);
        return "hello";
        //return "my name is " + studentProperties.getName() +"my age is " +studentProperties.getAge();
    }
    @RequestMapping("/hello2")
    public String hello2(){
        return "hello2";
        //return "my name is " + studentProperties.getName() +"my age is " +studentProperties.getAge();
    }
    @RequestMapping("/hello3")
    public String hello3(){
        return "hello3";
        //return "my name is " + studentProperties.getName() +"my age is " +studentProperties.getAge();
    }
    @RequestMapping("/hello4")
    public String hello4(){
        return "hello4";
        //return "my name is " + studentProperties.getName() +"my age is " +studentProperties.getAge();
    }
}
