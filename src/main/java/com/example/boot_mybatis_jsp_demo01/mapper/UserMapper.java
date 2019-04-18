package com.example.boot_mybatis_jsp_demo01.mapper;

import com.example.boot_mybatis_jsp_demo01.pojo.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author guwenke
 * @date 2019-03-29 14:51
 **/
@Mapper
@Component
public interface UserMapper {

    /**
     * 查询所有
     *
     * @return
     */
    @Select("select * from user")
    List<User> findAll();

    /**
     * 添加
     *
     * @param user
     * @return
     */
    @Insert("insert into user(name,password) values(#{name},#{password})")
    int add(User user);

    /**
     * 删除
     *
     * @param id
     */
    @Delete("delete from user where id=#{name}")
    void deleteById(int id);

    /**
     * 修改
     *
     * @param user
     */
    @Update("update user set name=#{user.name},password=#{user.password} where id=user.id")
    void update(User user);
}
