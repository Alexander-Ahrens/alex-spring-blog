package com.codeup.blog.blog.controllers;

import org.springframework.web.bind.annotation.*;

public class PostController {

    @GetMapping(path = "/posts")
    @ResponseBody
    public String add() {
        return "This is the index page";

    }


    @GetMapping(path = "/posts/{id}")
    @ResponseBody
    public String subtract(@PathVariable String id) {
        return "Your student ID is " + id + ".";

    }


    @GetMapping(path = "/posts/create")
    @ResponseBody
    public String create() {
        return "Lets create some ish!";

    }


    @PostMapping(path = "posts/create")
    @ResponseBody
    public String divide(@PathVariable int num, @PathVariable int number) {
        int quotient = num / number;
        return num + " / " + number + " is equal to " + quotient + ".";

    }
}
