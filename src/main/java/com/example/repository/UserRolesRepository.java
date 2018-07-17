package com.example.repository;

import com.example.entity.UserRoles;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author yanzt
 * @date 2018/7/17 17:07
 * @description
 */
public interface UserRolesRepository extends JpaRepository<UserRoles,Long> {
}
