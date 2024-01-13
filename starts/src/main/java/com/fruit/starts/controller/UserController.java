package com.fruit.starts.controller;

import com.fruit.starts.entity.User;
import com.fruit.starts.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("list")
    public List<User> getList() {
        return userMapper.findAll();
    }
}
