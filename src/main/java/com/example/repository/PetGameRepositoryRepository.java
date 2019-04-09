package com.example.repository;

import com.example.dto.PetGameRepositoryDto;
import com.example.entity.PetGameRepository;
import com.example.entity.PetGameRepositoryVo;
import com.example.entity.PetGameRepositoryVo2;
import com.example.entity.Test1;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @author yanzt
 * @date 2018/7/17 15:21
 * @description
 */
public interface PetGameRepositoryRepository extends BaseRepository<PetGameRepository,Long> {

    @Query(value = "SELECT pr.create_date as createDate,pr.shop_good_id as shopGoodId,pr.shop_good_number as shopGoodNumber" +
            ",pr.channel_id as channelId,pr.uid as uid,ps.goods_type as goodsType,ps.goods_icon as goodsIcon,ps.goods_name as goodsName" +
            ",ps.goods_code as goodsCode,ps.goods_desc as goodsDesc,ps.goods_price as goodsPrice,ps.energy as energy,ps.feed_time as feedTime " +
            "FROM pet_game_repository pr " +
            "INNER JOIN pet_game_shop ps ON pr.shop_good_id=ps.id " +
            "WHERE pr.enable_status=:enableStatus and pr.channel_id=:channelId " +
            "and ps.channel_id=:channelId and pr.uid=:uid ORDER BY pr.create_date DESC",nativeQuery = true)
    List<PetGameRepositoryVo> findAllRepositoryByChannelIdAndUid(@Param("channelId") String channelId, @Param("enableStatus") Long enableStatus, @Param("uid") Long uid);

    @Query(value = "select pr.createDate as createDate,pr.channelId as channelId,pr.shopGoodNumber as shopGoodNumber from PetGameRepository pr")
    List<PetGameRepositoryVo2> findSome();

    @Query(value = "select new com.example.dto.PetGameRepositoryDto(pr.createDate,pr.channelId,pr.shopGoodNumber) from PetGameRepository pr")
    List<PetGameRepositoryDto> findSome2();

    @Query(value = "select pr.createDate as createDate,pr.channelId as channelId,pr.shopGoodNumber as shopGoodNumber,ps.goodsName as goodsName,ps.goodsCode as goodsCode,ps.goodsDesc as goodsDesc from PetGameRepository pr" +
            " , PetGameShop ps where pr.shopGoodId=ps.id")
    List<PetGameRepositoryVo2> findInnerSome();

    @Query(value = "select new com.example.dto.PetGameRepositoryDto(pr.createDate,pr.channelId,pr.shopGoodNumber,ps.goodsName,ps.goodsCode,ps.goodsDesc) from PetGameRepository pr" +
            " , PetGameShop ps where pr.shopGoodId=ps.id")
    List<PetGameRepositoryDto> findInnerSome2();
}
