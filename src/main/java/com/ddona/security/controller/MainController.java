package com.ddona.security.controller;

import com.ddona.security.entities.User;
import com.ddona.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainController {

    @Autowired
    private UserService userService;

    @GetMapping("/fake")
    public void fakeUser() {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        User user = new User(1, "admin", bCryptPasswordEncoder.encode("admin"), "admin", true);
        System.out.println(bCryptPasswordEncoder.encode("admin"));
        System.out.println(bCryptPasswordEncoder.encode("member"));
        userService.addUser(user);
        User user2 = new User(2, "member", bCryptPasswordEncoder.encode("member"), "member", true);
        userService.addUser(user2);
    }
}
