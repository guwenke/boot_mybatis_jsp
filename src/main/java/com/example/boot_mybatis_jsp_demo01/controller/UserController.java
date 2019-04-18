package com.example.boot_mybatis_jsp_demo01.controller;

import com.example.boot_mybatis_jsp_demo01.pojo.User;
import com.example.boot_mybatis_jsp_demo01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author guwenke
 * @date 2019-03-29 15:10
 **/
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/findAll")
    public String findAll(HttpServletRequest request) {
        List<User> userList = userService.findAll();
        request.setAttribute("userList", userList);
        return "listall";

    }

    @RequestMapping("/deleteById")
    public String deleteById(int id) {
        System.out.println(id);
        userService.deleteById(id);
        return "redirect:/user/findAll";
    }

}
