package com.example.repository;

import com.example.dto.PetGameChapterDto;
import com.example.entity.PetGameChapter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @author yanzt
 * @date 2019/4/19 22:50
 * @describe
 */
public interface PetGameChapterRepository extends JpaRepository<PetGameChapter,Long> {

    List<PetGameChapter> findByChannelIdAndEnableStatusOrderByCreateDateDesc(String channelId,Integer enableStatus);

    @Query(value = "SELECT id,chapter_name,chapter_version,chapter_desc,game_version FROM pet_game_chapter WHERE channel_id=:channelId and enable_status=:enableStatus and disabled_flag=:disabledFlag",nativeQuery = true)
    List<PetGameChapter> getPetGameChapterNameAndCode(@Param("channelId") String channelId, @Param("enableStatus") Integer enableStatus, @Param("disabledFlag") Integer disabledFlag);

    List<PetGameChapterDto> findByChannelIdAndEnableStatusAndDisabledFlagOrderByCreateDateDesc(String channelId, Integer enableStatus, Integer disabledFlag);
}
