package com.pcl.onlineshop.controller.health;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
    @PostMapping("health")
    public String health(){
        return "hello world";
    }
//    @GetMapping("health")
//    public String health(){
//        return "hello world";
//    }
}
