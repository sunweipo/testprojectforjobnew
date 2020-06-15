package com.sun.testprojectforjob.controller;

import com.sun.testprojectforjob.entity.User;
import com.sun.testprojectforjob.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/vaildLogin")
    @ResponseBody
    public int vaildLogin(HttpServletResponse response, HttpServletRequest request, HttpSession session){
        String password = request.getParameter("password");
        String username = request.getParameter("username");
        User user=studentService.getUser(username);
        System.out.println("==="+password+"==="+username);
        if (user ==null ){
            return 2;
        }else{
            if(password.equals(user.getPassword())){
                session.setAttribute("user",user);
                session.setAttribute("test",user.getPhonenumber());
                System.out.println("==="+user.toString());
                return 0;
            }else{
                return 1;
            }
        }
    }

    @RequestMapping("/toLoading")
     public String toLoading(HttpServletRequest request,
                           HttpServletResponse response, Model model) {
        User user=(User) request.getSession().getAttribute("user");
        if (user==null){
            return "redirect:login";
        }
        System.out.println("========="+user.toString());
        return "hello2";
    }
}
