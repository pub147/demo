package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class DemoController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/demo")
    public String demo(Model model) {

        model.addAttribute("name", "hwangkangsuk");

        return "demo";
    }
}
