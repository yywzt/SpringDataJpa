package com.example.controller;

import com.example.entity.Roles;
import com.example.repository.RolesRepository;
import com.example.service.RolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
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

    @Autowired
    private RolesService rolesService;

    @RequestMapping("/{id}")
    public Optional<Roles> selectById(@PathVariable Long id){
        return rolesRepository.findById(id);
    }

    @RequestMapping("/findAll")
    public List<Roles> findAll(){
        List<Roles> all = rolesRepository.findAll();
        return all;
    }

    @RequestMapping("/test")
    private String test(){
        return "Hello Test2!";
    }

    @RequestMapping("/search")
    public List<Roles> search(){
        Roles roles = new Roles();
        roles.setRoleName("超级管理员");
        return rolesService.search(roles);
    }

    @RequestMapping("/pagination")
    public Page<Roles> pagination(){
        Roles roles = new Roles();
        roles.setRoleName("超级管理员");
        return rolesService.pagination(roles,0,1);
    }

}
