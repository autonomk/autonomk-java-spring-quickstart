package com.autonomk.autonomk_java_spring_quickstart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpaController {
    @RequestMapping(value = {"/", "/chat/**"})
    public String forward() {
        return "forward:/index.html";
    }
}   
