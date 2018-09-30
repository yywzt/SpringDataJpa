package com.example.queryDslResponsitory;

import com.example.entity.QRoles;
import com.example.entity.QUserInf;
import com.example.entity.QUserRoles;
import com.example.entity.UserInf;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.hibernate5.support.OpenSessionInViewFilter;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import java.util.List;

/**
 * @author ywyw2424@foxmail.com
 * @date 2018/9/30 14:37
 * @desc
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserInfRepositoryTest {

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

    @Bean
    public FilterRegistrationBean filterRegistrationBean(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new OpenSessionInViewFilter());
        filterRegistrationBean.addUrlPatterns("/**");
        return filterRegistrationBean;
    }

    @Test
    public void test(){
        QUserInf userInf = QUserInf.userInf;
        QRoles roles = QRoles.roles;
        QUserRoles userRoles = QUserRoles.userRoles;
        List<UserInf> fetch = jpaQueryFactory.select(userInf)
                .from(userInf,roles,userRoles)
                .where(userInf.id.eq(userRoles.userId)
                        .and(roles.id.eq(userRoles.roleId)))
                .orderBy(userInf.id.desc())
                .fetch();
        System.out.println(fetch);
    }

}