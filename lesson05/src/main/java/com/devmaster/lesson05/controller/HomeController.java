package com.devmaster.lesson05.controller;

import com.devmaster.lesson05.entity.Info;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping

public class HomeController {
    @GetMapping
    public String index() {
        return "index";
    }

    //profile
    @GetMapping("/profile")
    public String profile(Model model) {
        // Mock Data -> View
       // List<Info> profile = new ArrayList<Info>();

        Info profileInfo = new Info("Devmaster", "dev@gmail.com", "https://devmaster.edu.vn","092576112","25 Vu Ngoc Phan, Ha Noi");
        model.addAttribute("profileInfor", profileInfo);
        return "profile";
    }


    //fragments
    @GetMapping("/home")
        public String home(Model model){
//        List<Info> profiles = new ArrayList<Info>();
//        Info info = new Info();
//        info.setName("Khiêm");
//        info.setAddress("Thái Nguyên");
//        info.setEmail("khiemtn@gmail.com");
//        info.setPhone("098765432");
//        info.setWebsite("https://lkhiem23.com");
//        profiles.add(info);

        model.addAttribute("title", "Devmaster: Trang chủ");
            return "home";
    }

    @GetMapping("/about")
    public String about(Model model){
        return "about";
    }

    @GetMapping("/contact")
    public String contact(Model model){
        return "contact";
    }
}
