package com.example.demo.web.controller;


import com.example.demo.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/test")
    public String  test(Model model){
        User user = new User();
        user.setUserName("admin");
        user.setPassword("123");
        model.addAttribute("user",user);
        return "test";
    }
}
