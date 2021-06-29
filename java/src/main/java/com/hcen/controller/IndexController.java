package com.hcen.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @GetMapping("/admin")
    public String admin() {
        return "you are not admin :D";
    }
}
