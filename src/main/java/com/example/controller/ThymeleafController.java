package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author gaosong
 * @Date 2021/1/11 19:16
 * @Version 1.0
 */
@Controller
public class ThymeleafController {

    @GetMapping("/thymeleaf")
    public String hello(HttpServletRequest request,
                        @RequestParam(value = "description",required = false,
                        defaultValue = "springboot-thymeleaf")String description){
        request.setAttribute("description",description);
        return "thymeleaf";


    }

}
