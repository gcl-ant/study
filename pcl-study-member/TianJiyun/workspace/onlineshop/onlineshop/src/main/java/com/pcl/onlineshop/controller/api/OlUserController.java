package com.pcl.onlineshop.controller.api;

import com.pcl.onlineshop.servcie.OlUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OlUserController {
    @Autowired
    OlUserService olUserService;
}
