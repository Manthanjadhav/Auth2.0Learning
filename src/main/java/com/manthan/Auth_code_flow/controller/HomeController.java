package com.manthan.Auth_code_flow.controller;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String Home(OAuth2AuthenticationToken token){
        String email = token.getPrincipal().getAttribute("email");
        String name = token.getPrincipal().getAttribute("name");
        String authority = token.getAuthorities().toString();
        return "Hello "+name+" "+email+" "+authority;
    }
}
