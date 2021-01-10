package com.example.skywalking_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: chenglong.ren
 * @Date: 2021/1/10
 * @Desc:
 */
@RestController
public class MyController {
    @GetMapping("/sayBoot")
    public String sayBoot() {
        return "hello Boot";
    }

    @GetMapping("/exception")
    public String exception() {
        int i = 1 / 0;
        return "hello Boot";
    }
}
