package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
@Controller
public class HelloWebController {
    @GetMapping("/web")
    public String hello(){
        return "hello.html";
    }

    @GetMapping("/web/message")
    public String message(Model model){
        model.addAttribute("message","This is custom message");
        return "message.html";
    }
}
