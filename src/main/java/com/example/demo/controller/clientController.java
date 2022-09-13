package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class clientController {

    @PostMapping("/client/signin")
    public void signIn(@RequestParam("username") String username
            ,@RequestParam("password") String password
            , @RequestParam("email") String email)
    {

    }
}
