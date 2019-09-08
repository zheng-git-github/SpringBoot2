package com.liang.lxspringbootmybatismapper.ServiceImpl;


import com.liang.lxspringbootmybatismapper.Dao.StuDao;
import com.liang.lxspringbootmybatismapper.Service.StuService;
import com.liang.lxspringbootmybatismapper.pojo.Stu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StuServiceImpl implements StuService {
    @Autowired
    private StuDao dao;
    @Override
    public List<Stu> listAll() {
        return dao.listAll();
    }
}
