package com.codeup.blog.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MathController {

    @RequestMapping(path = "/add/{num1}/and/{num2}", method = RequestMethod.GET)
    @ResponseBody
    public String add(@PathVariable int num1, @PathVariable int num2) {
        int sum = num1 + num2;
        return num1 + " + " + num2 + " is equal to " + sum + ".";

    }


    @RequestMapping(path = "/subtract/{num1}/from/{num2}", method = RequestMethod.GET)
    @ResponseBody
    public String subtract(@PathVariable int num1, @PathVariable int num2) {
        int difference = num1 - num2;
        return num1 + " - " + num2 + " is equal to " + difference + ".";

    }


    @RequestMapping(path = "/multiply/{num1}/and/{num2}", method = RequestMethod.GET)
    @ResponseBody
    public String multiply(@PathVariable int num1, @PathVariable int num2) {
        int product = num1 * num2;
        return num1 + " * " + num2 + " is equal to " + product + ".";

    }


    @RequestMapping(path = "/divide/{num1}/by/{num2}", method = RequestMethod.GET)
    @ResponseBody
    public String divide(@PathVariable double num1, @PathVariable double num2) {
        if (num2 == 0) {
            return "It is impossible to divide by 0.";
        }
            double quotient = num1 / num2;
            return num1 + " / " + num2 + " is equal to " + quotient + ".";

    }
}
