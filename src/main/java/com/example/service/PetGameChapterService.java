package com.example.service;

import com.example.dto.PetGameChapterDto;
import com.example.entity.PetGameChapter;
import com.example.repository.PetGameChapterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yanzt
 * @date 2019/4/19 22:57
 * @describe
 */
@Service
public class PetGameChapterService {

    @Autowired
    private PetGameChapterRepository petGameChapterRepository;

    private static final Integer ENABLE_STATUS_NORMAL = 1;
    private static final Integer ENABLE_STATUS_DISABLED = 0;

    public List<PetGameChapter> getAllPetGameChapter(String selectChannelId){
        return petGameChapterRepository.findByChannelIdAndEnableStatusOrderByCreateDateDesc(selectChannelId,ENABLE_STATUS_NORMAL);
    }

    public List<PetGameChapter> getPetGameChapterNameAndCode(String selectChannelId){
        List<PetGameChapter> nameAndCode = petGameChapterRepository.getPetGameChapterNameAndCode(selectChannelId, ENABLE_STATUS_NORMAL,ENABLE_STATUS_NORMAL);
        return nameAndCode;
    }
    public List<PetGameChapterDto> findByChannelIdAndEnableStatusAndDisabledFlagOrderByCreateDateDesc(String selectChannelId){
        List<PetGameChapterDto> nameAndCode = petGameChapterRepository.findByChannelIdAndEnableStatusAndDisabledFlagOrderByCreateDateDesc(selectChannelId, ENABLE_STATUS_NORMAL,ENABLE_STATUS_NORMAL);
        return nameAndCode;
    }
}
