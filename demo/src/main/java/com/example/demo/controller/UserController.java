package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/user")
@Component
public class UserController {


    @Autowired
    private UserMapper userMapper;
    @Autowired
    private static UserMapper userService;
    @PostConstruct
    //save()方法一直没用,显示未使用,加了上面的postmapping才有用,另外postman的传入只有josn格式有用,正确传入了
    public Integer save(@RequestBody User user){
        return UserService.save(user);
    }
    @GetMapping
    public List<User> index(){
        return userMapper.findAll();
    }
}
