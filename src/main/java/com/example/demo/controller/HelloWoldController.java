package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @创建人 steffens
 * @创建时间 2019/6/15
 * @描述 文件创建
 */
@Controller
public class HelloWoldController {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello World";
    }

    @RequestMapping("/world")
    @ResponseBody
    public String world() {
        return "World Hello";
    }
}
