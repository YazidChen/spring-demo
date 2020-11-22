package com.yazid.demo.spring.springmvc.controller;

import com.yazid.demo.spring.springmvc.query.ValidationQuery;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

/**
 * @author Yazid
 * @date 2020/11/21 下午9:57
 */
@Controller
public class HomeController {
    @GetMapping("home")
    public String home() {
        return "home";
    }

    @PostMapping("process")
    public String process(@Valid ValidationQuery query, Errors errors) {
        if (errors.hasErrors()) {
            return "error";
        }
        return "home";
    }
}
