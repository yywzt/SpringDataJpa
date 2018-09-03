package com.example.controller;

import com.example.entity.UserInf;
import com.example.repository.UserInfRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

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

    @RequestMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id){
        userInfRepository.deleteById(id);
    }

    /*@RequestMapping("/{id}")
    public Optional<UserInf> selectById(@PathVariable Long id){
        return userInfRepository.findById(id);
    }*/
}
