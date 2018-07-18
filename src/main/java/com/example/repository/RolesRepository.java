package com.example.repository;

import com.example.entity.Roles;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * @author yanzt
 * @date 2018/7/17 13:05
 * @description
 */
@Transactional(readOnly = true)
public interface RolesRepository extends BaseRepository<Roles,Long> {

    Optional<Roles> findByRoleCode(String roleCode);

    @Transactional
    void deleteById(Long id);

    @Transactional
    void deleteByRoleCode(String roleCode);
}
