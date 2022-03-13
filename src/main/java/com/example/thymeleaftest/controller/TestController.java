package com.example.thymeleaftest.controller;

import com.example.thymeleaftest.dto.Post;
import com.example.thymeleaftest.dto.Status;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TestController {

    @GetMapping("test")
    public String helloPage(Model model) {
        model.addAttribute("testMsg", "Hello from server");
        model.addAttribute("time", System.currentTimeMillis());

        List<Post> posts = new ArrayList<>();
        posts.add(new Post("title 1", "body qwerrtrtuy1"));
        posts.add(new Post("title 2", "body qwerrtrtuy2"));
        posts.add(new Post("title 3", "body qwerrtrtuy3"));
        model.addAttribute("testPosts", posts);

        model.addAttribute("status", Status.NEW.toString());

        return "test";
    }

    @GetMapping("world")
    public String worldPage(Model model) {
        model.addAttribute("testMsg", 10);
        var post = new Post("Hot news", "qwertyuio");
        model.addAttribute("post", post);
        return "data/world";
    }
}
