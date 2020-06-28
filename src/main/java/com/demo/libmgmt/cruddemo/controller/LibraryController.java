package com.demo.libmgmt.cruddemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LibraryController {

    @GetMapping("/")
    public String showHomePage(Model model) {
        // stub
        return "home_page";
    }
}
