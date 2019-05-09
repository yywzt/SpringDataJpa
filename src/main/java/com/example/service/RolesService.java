package com.example.service;

import com.example.entity.Roles;
import com.example.repository.RolesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.*;
import java.util.Date;
import java.util.List;

/**
 * @author yanzt
 * @date 2018/7/17 14:34
 * @description
 */
@Service
public class RolesService {

    @Autowired
    private RolesRepository rolesRepository;

    public RolesRepository getRolesRepository() {
        return rolesRepository;
    }

    public void save(Roles roles){
        rolesRepository.save(roles);
    }

    /**
     * 使用Example进行复杂查询
     * */
    public List<Roles> search(Roles roles){
        ExampleMatcher exampleMatcher = ExampleMatcher.matching().withMatcher("roleName", matcher -> matcher.endsWith());
        Example<Roles> example = Example.of(roles,exampleMatcher);

        List<Roles> all = rolesRepository.findAll(example);
        rolesRepository.findAll(new Specification<Roles>() {
            @Override
            public Predicate toPredicate(Root<Roles> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
                Path<String> exp1 = root.get("taskName");
                Path<Date>  exp2 = root.get("createTime");
                Path<String> exp3 = root.get("taskDetail");
                Predicate predicate = criteriaBuilder.and(criteriaBuilder.like(exp1, "%taskName%"),criteriaBuilder.greaterThanOrEqualTo(exp2, new Date()));
                return criteriaBuilder.or(predicate,criteriaBuilder.equal(exp3, "kkk"));
            }
        });
        return all;
    }

    /**
     * 使用Example进行分页查询
     * */
    public Page<Roles> pagination(Roles roles,int pageNumber,int pageSize){
        ExampleMatcher exampleMatcher = ExampleMatcher.matching().withMatcher("roleName", matcher -> matcher.contains());
        Example<Roles> example = Example.of(roles, exampleMatcher);
        PageRequest pageRequest = PageRequest.of(pageNumber,pageSize,new Sort(Sort.Direction.DESC,"id"));

        Page<Roles> rolesPage = rolesRepository.findAll(example, pageRequest);
        return rolesPage;
    }

}
