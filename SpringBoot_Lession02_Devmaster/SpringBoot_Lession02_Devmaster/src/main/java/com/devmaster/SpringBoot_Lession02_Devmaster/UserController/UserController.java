package com.devmaster.SpringBoot_Lession02_Devmaster.UserController;

import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @GetMapping("/getusers")
    public String getUser(){
        return "Hello World";
    }
    @PostMapping("/users")
    public String createUser(){
        return "<h1>Create Users</h1>";
    }

    @PutMapping("/users/{id}")
        public String updateUser(@PathVariable int id){
            return "<h1>User with ID: "+ id + "updated";
        }

    @PutMapping("/users/{id}")
        public String deleteUser(@PathVariable int id){
        return "<h1>User with ID: "+ id + "deleted";
        }
    }

