package com.example.controller;

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

    @Autowired
    private PetGameChapterRepository petGameChapterRepository;

    @RequestMapping("/test1")
    public List<Test> test1(){
        List<Test> allTest = testRepository.findAllTest();
        return allTest;
    }
    @RequestMapping("/test2")
    public List<Test> test2(){
        List<Test> allTest = testRepository.findAllTest2();
        return allTest;
    }
    @RequestMapping("/test3")
    public List<PetGameChapter> test3(){
        List<PetGameChapter> allTest = petGameChapterRepository.getPetGameChapterNameAndCode("AA1000",1,1);
        return allTest;
    }
}
