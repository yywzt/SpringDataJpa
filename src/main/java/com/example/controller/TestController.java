package com.example.controller;

import com.example.dto.TestVo;
import com.example.entity.PetGameChapter;
import com.example.entity.Test;
import com.example.repository.PetGameChapterRepository;
import com.example.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author yanzt
 * @date 2019/4/19 22:14
 * @describe
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestRepository testRepository;


    @RequestMapping("/findbyType")
    public List<TestVo> findbyType(){
        List<TestVo> allTest = testRepository.findbyType();
        return allTest;
    }
    @RequestMapping("/findbyType2")
    public List<TestVo> findbyType2(){
        List<TestVo> allTest = testRepository.findbyType2();
        return allTest;
    }
    @RequestMapping("/findAllTest")
    public List<TestVo> test1(){
        List<TestVo> allTest = testRepository.findAllTest();
        return allTest;
    }
    @RequestMapping("/findAllTest2")
    public List<TestVo> test2(){
        List<TestVo> allTest = testRepository.findAllTest2();
        return allTest;
    }
    @RequestMapping("/findAllTest3")
    public List<TestVo> findAllTest3(){
        List<TestVo> allTest = testRepository.findAllTest3();
        return allTest;
    }
    @RequestMapping("/findAllTest4")
    public List<Test> findAllTest4(){
        List<Test> allTest = testRepository.findAllTest4();
        return allTest;
    }
}
