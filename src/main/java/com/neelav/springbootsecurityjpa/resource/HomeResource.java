package com.neelav.springbootsecurityjpa.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

    @GetMapping("/")
    public String getHome()
    {
        return "<h1>Welcome To Home</h1>";
    }

    @GetMapping("/user")
    public String getUser()
    {
        return "<h1>Welcome To User and Admins</h1>";
    }

    @GetMapping("/admin")
    public String getAdmin()
    {
        return "<h1>Welcome To Admins Only</h1>";
    }
}
