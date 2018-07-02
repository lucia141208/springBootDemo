package com.springboot.demo.controller;

import com.springboot.demo.dao.DemoDao;
import com.springboot.demo.domain.User;
import com.springboot.demo.service.DemoService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import sun.misc.Cache;

import javax.jws.soap.SOAPBinding;
import java.util.List;

@Controller
@RequestMapping("/user")
@ComponentScan({"com.springboot.demo.service"})
public class UserController {

    @Autowired
    private DemoService demoServiceImpl;


    @RequestMapping(value="/list")
    public String list( @RequestParam(value="name" , required=false,defaultValue="world") String name,
                            ModelMap model ) {
        List<User> userList = demoServiceImpl.findAllUser();
        model.addAttribute("userList",userList);
        model.addAttribute("hello","freemarker");
        return "/user/list";
    }

    @RequestMapping(value="/save")
    public String save() {
        User user = new User();
        user.setUsername("张苏纳");
        try {
            demoServiceImpl.createUser(user);
        }catch (Exception e){
            e.printStackTrace();
        }

        return "greets";
    }
}
