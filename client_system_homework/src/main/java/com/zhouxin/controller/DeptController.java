package com.zhouxin.controller;

import com.zhouxin.domain.Dept;
import com.zhouxin.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/dept")    // 设置一级目录
public class DeptController {

    @Autowired
    private DeptService deptService;

    @RequestMapping("/findById")
    @ResponseBody
    public Dept findById(Integer dept_id){

        Dept dept = deptService.findById(dept_id);

        return dept;

    }

}
