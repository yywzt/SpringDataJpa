package com.example.queryDslResponsitory;

import com.example.entity.Roles;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author yanzt
 * @date 2018/7/17 13:05
 * @description
 */
@Transactional(readOnly = true)
public interface QueryDslRolesRepository extends QueryDslBaseRepository<Roles,Long> {
}