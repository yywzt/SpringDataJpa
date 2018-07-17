package com.example.service;

import com.example.entity.Roles;
import com.example.repository.RolesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yanzt
 * @date 2018/7/17 14:34
 * @description
 */
@Service
public class RolesService {

    private RolesRepository rolesRepository;

    public RolesRepository getRolesRepository() {
        return rolesRepository;
    }

    public void setRolesRepository(@Autowired RolesRepository rolesRepository) {
        this.rolesRepository = rolesRepository;
    }

    public void save(Roles roles){
        rolesRepository.save(roles);
    }

}
