package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yanzt
 * @date 2019/4/11 10:12
 * @describe
 */
@RestController
public class IindexController {

    @RequestMapping("/index")
    public void index(String name,String age){
        System.out.println("name: " + name + ",age: " + age );
    }

    @RequestMapping("/index2")
    public void index2(@RequestParam String name, String age){
        System.out.println("name: " + name + ",age: " + age );
    }

    @RequestMapping("/index3")
    public void index3(@RequestParam String name, @RequestParam String age){
        System.out.println("name: " + name + ",age: " + age );
    }
}
