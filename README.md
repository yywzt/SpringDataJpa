## Spring Data Jpa 测试用例

#### 查询创建

通常，JPA的查询创建机制的工作方式如“ [查询方法](https://docs.spring.io/spring-data/jpa/docs/2.1.0.M3/reference/html/#repositories.query-methods) ”中所述。以下示例显示了JPA查询方法转换为的内容：

Table 3.方法名称中支持的关键字 

| Keyword             | Sample                                                       | JPQL snippet                                                 |
| ------------------- | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `And`               | `findByLastnameAndFirstname`                                 | `… where x.lastname = ?1 and x.firstname = ?2`               |
| `Or`                | `findByLastnameOrFirstname`                                  | `… where x.lastname = ?1 or x.firstname = ?2`                |
| `Is,Equals`         | `findByFirstname `, `findByFirstnameIs`, `findByFirstnameEquals` | `… where x.firstname = ?1`                                   |
| `Between`           | `findByStartDateBetween`                                     | `… where x.startDate between ?1 and ?2`                      |
| `LessThan`          | `findByAgeLessThan`                                          | `… where x.age < ?1`                                         |
| `LessThanEqual`     | `findByAgeLessThanEqual`                                     | `… where x.age <= ?1`                                        |
| `GreaterThan`       | `findByAgeGreaterThan`                                       | `… where x.age > ?1`                                         |
| `GreaterThanEqual`  | `findByAgeGreaterThanEqual`                                  | `… where x.age >= ?1`                                        |
| `After`             | `findByStartDateAfter`                                       | `… where x.startDate > ?1`                                   |
| `Before`            | `findByStartDateBefore`                                      | `… where x.startDate < ?1`                                   |
| `IsNull`            | `findByAgeIsNull`                                            | `… where x.age is null`                                      |
| `IsNotNull,NotNull` | `findByAge(Is)NotNull`                                       | `… where x.age not null`                                     |
| `Like`              | `findByFirstnameLike`                                        | `… where x.firstname like ?1`                                |
| `NotLike`           | `findByFirstnameNotLike`                                     | `… where x.firstname not like ?1`                            |
| `StartingWith`      | `findByFirstnameStartingWith`                                | `… where x.firstname like ?1`(parameter bound with appended `%`) |
| `EndingWith`        | `findByFirstnameEndingWith`                                  | `… where x.firstname like ?1`(parameter bound with prepended `%`) |
| `Containing`        | `findByFirstnameContaining`                                  | `… where x.firstname like ?1`(parameter bound wrapped in `%`) |
| `OrderBy`           | `findByAgeOrderByLastnameDesc`                               | `… where x.age = ?1 order by x.lastname desc`                |
| `Not`               | `findByLastnameNot`                                          | `… where x.lastname <> ?1`                                   |
| `In`                | `findByAgeIn(Collection<Age> ages)`                          | `… where x.age in ?1`                                        |
| `NotIn`             | `findByAgeNotIn(Collection<Age> ages)`                       | `… where x.age not in ?1`                                    |
| `True`              | `findByActiveTrue()`                                         | `… where x.active = true`                                    |
| `False`             | `findByActiveFalse()`                                        | `… where x.active = false`                                   |
| `IgnoreCase`        | `findByFirstnameIgnoreCase`                                  | `… where UPPER(x.firstame) = UPPER(?1)`                      |

示例.从方法名称创建查询

```java
package com.example.repository;

import com.example.entity.Roles;

import java.util.Optional;

/**
 * @author yanzt
 * @date 2018/7/17 13:05
 * @description
 */
public interface RolesRepository extends BaseRepository<Roles,Long> {

    Optional<Roles> findByRoleCode(String roleCode);
}
```

sql为:

```sql
select
        roles0_.id as id1_0_,
        roles0_.role_code as role_cod2_0_,
        roles0_.role_name as role_nam3_0_ 
    from
        roles roles0_ 
    where
        roles0_.role_code=?
```

返回结果为：

```json
{
    "id": 2,
    "roleName": "普通用户",
    "roleCode": "ROLE_USER"
}
```



#### EXample复杂查询

```java
/**
     * 使用Example进行复杂查询
     * */
    public List<Roles> search(Roles roles){
        ExampleMatcher exampleMatcher = ExampleMatcher.matching().withMatcher("roleName", matcher -> matcher.endsWith());
        Example<Roles> example = Example.of(roles,exampleMatcher);

        List<Roles> all = rolesRepository.findAll(example);
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
```



