package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    @PostMapping
    public int save(User user){
        if(user.getId() == null){//user没有id
            return userMapper.insert(user);//没有id就插入
        }else {
            return userMapper.update(user);

        }

    }
}
