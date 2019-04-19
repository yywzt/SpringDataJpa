package com.example.repository;


import com.example.entity.Test;
import com.example.entity.TestVo;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author yanzt
 * @date 2018/7/17 15:21
 * @description
 */
public interface TestRepository extends JpaSpecificationExecutor<Test>,BaseRepository<Test,Long> {

    @Query(value = "SELECT t.desc as descs,t1.`name` as name,t1.`code` as code from test t INNER JOIN test1 t1 on t.id=t1.test_id",nativeQuery = true)
    public List<TestVo> findbyType();

    @Query(value = "SELECT t1.`name` as name,t1.`code` as code,t.descs as descs from test t INNER JOIN test1 t1 on t.id=t1.test_id",nativeQuery = true)
    public List<TestVo> findbyType2();

    @Query(value = "select descs from test",nativeQuery = true)
    public List<Test> findAllTest();
    @Query(value = "select t.descs from test t",nativeQuery = true)
    public List<Test> findAllTest2();

}
