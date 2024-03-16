package com.english.learnarium.controller;

import com.english.learnarium.service.CredentialsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class CredentialsController {

    private final CredentialsService credentialsService;

    @GetMapping("/credentials")
    public String getCredentials() {
        String username = credentialsService.getUsername();
        String password = credentialsService.getPassword();
        return "Username: " + username + ", Password: " + password;
    }
}


