package com.springSecurity.Demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/admin-controller")
public class AdminController {
    @GetMapping
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello I'm the admin");
    }

}
