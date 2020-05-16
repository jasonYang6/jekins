package com.jenkins.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

    @GetMapping("accountTxn/list")
    @ResponseBody
    public String bookJobList() {
        return "got!";
    }
}
