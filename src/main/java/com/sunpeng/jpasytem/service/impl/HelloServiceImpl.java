package com.sunpeng.jpasytem.service.impl;

import com.sunpeng.jpasytem.service.IHellloService;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements IHellloService {
    @Override
    public String hello() {
        return "hello";
    }
}
