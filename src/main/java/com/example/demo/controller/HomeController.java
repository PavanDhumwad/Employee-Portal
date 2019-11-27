package com.example.demo.controller;

import com.example.demo.util.Constants;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping(Constants.SAVE_EMP)
    public String home()
    {
        return "index";
    }
}
