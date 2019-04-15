package com.ln.dubbo.provider.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.ln.dubbo.api.service.TestService;

@Service
public class TestServiceImpl implements TestService {


    @Override
    public String Ticket() {
        return "<厉害了，我的国>";
    }
}
