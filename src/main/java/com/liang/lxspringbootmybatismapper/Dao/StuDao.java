package com.liang.lxspringbootmybatismapper.Dao;

import com.liang.lxspringbootmybatismapper.pojo.Stu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;

//这里不用@Mapper，在启动类上一次性注入
public interface StuDao {
    //注解模式下:在方法上写sql语句@Select("select * from student")
    List<Stu> listAll();
}
