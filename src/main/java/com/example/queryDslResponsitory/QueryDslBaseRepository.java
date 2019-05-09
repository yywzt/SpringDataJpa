package com.example.queryDslResponsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

/**
 * @author yanzt
 * @date 2018/7/17 13:09
 * @description
 */
@NoRepositoryBean
public interface QueryDslBaseRepository<T,PK extends Serializable>
        extends JpaRepository<T,PK>,
        JpaSpecificationExecutor<T>,
        QuerydslPredicateExecutor<T>
{
}