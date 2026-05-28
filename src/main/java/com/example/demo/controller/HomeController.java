package com.example.demo.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {

        model.addAttribute("message", "mahindra battery 11111!");

        return "index";
    }
}




//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class HomeController {
//
//    @GetMapping("/")
//    public String home() {
//    	
//        return "index";
//
//    }
//}