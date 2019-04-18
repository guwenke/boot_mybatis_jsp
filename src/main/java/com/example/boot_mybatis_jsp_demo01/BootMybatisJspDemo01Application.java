package com.example.boot_mybatis_jsp_demo01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.boot_mybatis_jsp_demo01.mapper.UserMapper")
public class BootMybatisJspDemo01Application {

	public static void main(String[] args) {
		SpringApplication.run(BootMybatisJspDemo01Application.class, args);
	}

}
