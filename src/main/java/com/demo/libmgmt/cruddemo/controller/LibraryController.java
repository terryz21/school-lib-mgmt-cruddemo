package com.demo.libmgmt.cruddemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LibraryController {

    @RequestMapping("/")
    public String showHomePage() {
        // stub
        return "";
    }
}
