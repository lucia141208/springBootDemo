package com.springboot.demo.dao;

import com.springboot.demo.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository("demoDao")
public interface DemoDao {

    /**
     * 新增用户
     * @param user
     */
    void createUser(User user);
    /**
     * 查询用户列表
     * @return
     */
    List<User> findAllUser();

}
