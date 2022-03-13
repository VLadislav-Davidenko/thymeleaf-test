package com.example.thymeleaftest.controller;

import com.example.thymeleaftest.dto.Post;
import com.example.thymeleaftest.dto.Status;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class RoutingController {

    @GetMapping("/")
    public String indexPage(Model model) {

        return "index";
    }

}
