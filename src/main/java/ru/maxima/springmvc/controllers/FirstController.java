package ru.maxima.springmvc.controllers;

import org.springframework.web.bind.annotation.GetMapping;

public class FirstController {
    @GetMapping("/hello")
    public String hello() {
        return "hello_world";
    }
}
