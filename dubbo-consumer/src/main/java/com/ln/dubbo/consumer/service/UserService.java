package com.ln.dubbo.consumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ln.dubbo.api.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Reference
    TestService testService;

    public String getTicket(){
        String ticket = testService.Ticket();
        return ticket;
    }

}
