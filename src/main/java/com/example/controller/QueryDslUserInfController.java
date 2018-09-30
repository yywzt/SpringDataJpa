package com.example.controller;

import com.example.entity.QRoles;
import com.example.entity.QUserInf;
import com.example.entity.QUserRoles;
import com.example.entity.UserInf;
import com.example.queryDslResponsitory.QueryDslUserInfRepository;
import com.querydsl.jpa.JPAExpressions;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import java.util.List;

/**
 * @author ywyw2424@foxmail.com
 * @date 2018/9/30 15:33
 * @desc
 */
@RestController
public class QueryDslUserInfController {

    @Autowired
    private QueryDslUserInfRepository queryDslUserInfRepository;

    //实体管理者
    @Autowired
    private EntityManager entityManager;

    private JPAQueryFactory jpaQueryFactory;

    @PostConstruct
    public void initFactory(){
        jpaQueryFactory = new JPAQueryFactory(entityManager);
        System.out.println("init JPAQueryFactory successfully");
    }

    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    public List<UserInf> test(){
        QUserInf userInf = QUserInf.userInf;
        List<UserInf> fetch = jpaQueryFactory.selectFrom(userInf)
                .orderBy(userInf.id.asc())
                .fetch();
        System.out.println(fetch);
        return fetch;
    }
}
