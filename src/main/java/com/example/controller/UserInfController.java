package com.example.controller;

import com.example.entity.UserInf;
import com.example.repository.UserInfRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author yanzt
 * @date 2018/7/17 15:21
 * @description
 */
@RestController
@RequestMapping("/user")
public class UserInfController {

    @Autowired
    private UserInfRepository userInfRepository;

    @RequestMapping("/all")
    public List<UserInf> findAll(){
        return userInfRepository.findAll();
    }
}
