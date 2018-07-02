package com.springboot.demo.service;

import com.springboot.demo.domain.User;

import java.util.List;

public interface DemoService {

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
