package com.springboot.demo.controller;

import com.springboot.demo.service.impl.MailServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @Autowired
    private MailServiceImpl mailService;


    private  static final org.slf4j.Logger logger=LoggerFactory.getLogger(HelloController.class);

    @RequestMapping(value="/login")
    public String login() {
        System.out.printf("login method.......");
        logger.info("日志info");
        logger.debug("------------debug----------");
        logger.error("-----------error----------");
        String to="3171889225@qq.com";
        mailService.sendSimpleMail(to, "主题：简单邮件", "测试邮件内容");

        return "login";
    }
}
