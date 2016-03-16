package com.vzt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.ArrayList;

@Controller
public class AppController {

    @RequestMapping("/hello")
    public String hello(@RequestParam(value="name", required=false) String name, Model model) {
        return "helloworld";
    }
}
