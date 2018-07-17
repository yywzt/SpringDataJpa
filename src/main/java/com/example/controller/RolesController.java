package com.example.controller;

import com.example.entity.Roles;
import com.example.repository.RolesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

/**
 * @author yanzt
 * @date 2018/7/17 13:11
 * @description
 */
@RestController
@RequestMapping("/roles")
public class RolesController {

    @Autowired
    private RolesRepository rolesRepository;

    @RequestMapping("/{id}")
    public Optional<Roles> selectById(@PathVariable Long id){
        return rolesRepository.findById(id);
    }

    @RequestMapping("/findAll")
    public List<Roles> findAll(){
        return rolesRepository.findAll();
    }

    @RequestMapping("/test")
    private String test(){
        return "Hello Test2!";
    }

}
