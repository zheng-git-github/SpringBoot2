package com.liang.lxspringbootmybatismapper;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.liang.lxspringbootmybatismapper.Dao")
public class LxSpringbootMybatisMapperApplication {

    public static void main(String[] args) {
        SpringApplication.run(LxSpringbootMybatisMapperApplication.class, args);
    }

}
