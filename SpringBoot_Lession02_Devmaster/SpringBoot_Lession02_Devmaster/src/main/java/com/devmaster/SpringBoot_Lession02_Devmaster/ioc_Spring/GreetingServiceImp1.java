package com.devmaster.SpringBoot_Lession02_Devmaster.ioc_Spring;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImp1 implements GreetingService {
    @Override
    public String greet(String name) {
        return "Hello " + name + "!";
    }
}
