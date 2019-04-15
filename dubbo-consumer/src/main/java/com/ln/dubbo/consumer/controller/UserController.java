package com.ln.dubbo.consumer.controller;

import com.ln.dubbo.consumer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/")
    public String test(){
        String result=userService.getTicket();
        return "服务端饭会信息："+result;
    }
}
