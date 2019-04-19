package com.example.repository;


import com.example.dto.TestVo;
import com.example.entity.Test;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author yanzt
 * @date 2018/7/17 15:21
 * @description
 */
public interface TestRepository extends JpaSpecificationExecutor<Test>,BaseRepository<Test,Long> {

    @Query(value = "SELECT t.descs as descs,t1.`name` as name,t1.`code` as code from test t INNER JOIN test1 t1 on t.id=t1.test_id",nativeQuery = true)
    List<TestVo> findbyType();

    @Query(value = "SELECT t1.`name` as name,t1.`code` as code,t.descs as descs from test t INNER JOIN test1 t1 on t.id=t1.test_id",nativeQuery = true)
    List<TestVo> findbyType2();

    @Query(value = "select descs from test",nativeQuery = true)
    List<TestVo> findAllTest();

    /**
     * nativeQuery = false时需要使用别名
     * descs as descs
     * 否则值为null
     * */
    @Query(value = "select descs as descs from Test")
    List<TestVo> findAllTest2();

    @Query(value = "select t.descs as descs from Test t")
    List<TestVo> findAllTest3();

    @Query(value = "select t from Test t")
    List<Test> findAllTest4();

}
