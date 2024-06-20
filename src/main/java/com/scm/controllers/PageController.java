package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class PageController {

    @RequestMapping("/home")
    public static String home(Model model)
    {
        model.addAttribute("name", "Himanshu Vaidya");
        return "home";
    }

}
