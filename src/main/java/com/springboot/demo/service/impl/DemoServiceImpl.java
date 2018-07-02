package com.springboot.demo.service.impl;

import com.springboot.demo.dao.DemoDao;
import com.springboot.demo.domain.User;
import com.springboot.demo.service.DemoService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("demoServiceImpl")
@MapperScan("com.springboot.demo.dao")
public class DemoServiceImpl implements  DemoService {

    @Autowired
    private DemoDao demoDao;

    @Override
    public void createUser(User user) {
        demoDao.createUser(user);
    }

    @Override
    public List<User> findAllUser() {
        return demoDao.findAllUser();
    }
}
