package com.benjaminkong.controller;

import com.benjaminkong.domain.User;
import com.benjaminkong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.Collection;

/**
 * @author Benjamin Kong
 * @create 2021/8/12 20:30
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello sprinigboot";
    }
    @Autowired
    private UserService userService;
    @GetMapping("/user")
    public void getUserInfo(){
        Collection<User> users=userService.getUserInfo();
            System.out.println(users);
    }
    @PostMapping("/user")
    public String postUserInfo(User user ){
        userService.save(user);
        System.out.println(user.toString());
        return user.toString();
    }
}
