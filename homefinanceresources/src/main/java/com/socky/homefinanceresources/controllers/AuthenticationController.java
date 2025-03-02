package com.socky.homefinanceresources.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.socky.homefinanceresources.models.Authentication.AuthenticationPostParameterModel;

@RestController
@RequestMapping("/api/Authentication")
@CrossOrigin(origins = "http://localhost:4200")
public class AuthenticationController {
    @PostMapping("")
    public void Post(@RequestBody AuthenticationPostParameterModel parameter) {
        System.out.println(parameter.userName);
        System.out.println(parameter.password);
    }
}