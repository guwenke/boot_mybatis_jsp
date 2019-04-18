package com.example.boot_mybatis_jsp_demo01.service;

import com.example.boot_mybatis_jsp_demo01.mapper.UserMapper;
import com.example.boot_mybatis_jsp_demo01.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author guwenke
 * @date 2019-03-29 15:00
 **/
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> findAll() {
        return userMapper.findAll();
    }

    public int add(User user) {
        return userMapper.add(user);
    }

    public void deleteById(int id) {
        userMapper.deleteById(id);
    }

    public void update(User user) {
        userMapper.update(user);
    }
}
