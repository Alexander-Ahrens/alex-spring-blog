package com.codeup.blog.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {

    @GetMapping("/hello")
    @ResponseBody
    public String sayHello() {
        return "Hello there!";
    }


    @GetMapping("/hello/{name}")
    @ResponseBody
    public String sayHelloWithName(@PathVariable String name) {
        System.out.println("name = " + name);
        return "<h1>Hello there, " + name + "!<h1/>";
    }

    @RequestMapping(path = "/increment/{number}", method = RequestMethod.GET)
    @ResponseBody
    public String addOne(@PathVariable int number) {
        return number + " plus 1 is " + (number + 1) + ".";
    }
}
