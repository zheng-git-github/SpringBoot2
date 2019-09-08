package com.liang.lxspringbootmybatismapper.Controller;


import com.liang.lxspringbootmybatismapper.Service.StuService;
import com.liang.lxspringbootmybatismapper.pojo.Stu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/stu")
public class StuController {
    @Autowired
    private StuService stuService;
    @RequestMapping("/list")
    public String listAll(Model model){
        List<Stu> list=stuService.listAll();
        model.addAttribute("ListAll",list);
        System.out.println("666");
        return "html/index";
    }
    @RequestMapping("/massage")
    @ResponseBody
    public String massage(){
        System.out.println("777");
        //ajax可以接收单个字符串返回，ResponseBoby在异步获取数据时使用，不使用会报错
        return "Hello,注解模式thymeleaf";
    }
}
