package com.devmaster.SpringBoot_Lession02_Devmaster.ioc_Spring;

import org.springframework.stereotype.Service;

@Service
public interface GreetingService {
    String greet(String name);
}
