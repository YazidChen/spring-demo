package com.yazid.demo.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Yazid
 * @date 2020/11/21 下午9:57
 */
@Controller
public class HomeController {
    @GetMapping
    public String home() {
        return "home";
    }
}
