package com.example.controller;

import com.example.dto.PetGameChapterDto;
import com.example.entity.PetGameChapter;
import com.example.service.PetGameChapterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author yanzt
 * @date 2019/4/19 22:58
 * @describe
 */
@RestController
@RequestMapping("/chapter")
public class PetGameChapterController {

    @Autowired
    private PetGameChapterService petGameChapterService;

    @RequestMapping("/test1")
    public List<PetGameChapter> test1(){
        String selectChannelId = "AA1000";
        List<PetGameChapter> petGameChapters = petGameChapterService.getAllPetGameChapter(selectChannelId);
        List<PetGameChapter> petGameChapterNameAndCode = petGameChapterService.getPetGameChapterNameAndCode(selectChannelId);
        System.out.println(petGameChapters);
        System.out.println(petGameChapterNameAndCode);
        return petGameChapterNameAndCode;
    }
    @RequestMapping("/test2")
    public List<PetGameChapter> test2(){
        String selectChannelId = "AA1000";
        List<PetGameChapter> petGameChapters = petGameChapterService.getAllPetGameChapter(selectChannelId);
        System.out.println(petGameChapters);
        return petGameChapters;
    }
    @RequestMapping("/test3")
    public List<PetGameChapter> test3(){
        String selectChannelId = "AA1000";
        List<PetGameChapter> petGameChapterNameAndCode = petGameChapterService.getPetGameChapterNameAndCode(selectChannelId);
        System.out.println(petGameChapterNameAndCode);
        return petGameChapterNameAndCode;
    }
    @RequestMapping("/test4")
    public List<PetGameChapterDto> test4(){
        String selectChannelId = "AA1000";
        List<PetGameChapterDto> petGameChapterNameAndCode = petGameChapterService.findByChannelIdAndEnableStatusAndDisabledFlagOrderByCreateDateDesc(selectChannelId);
        System.out.println(petGameChapterNameAndCode);
        return petGameChapterNameAndCode;
    }
}
