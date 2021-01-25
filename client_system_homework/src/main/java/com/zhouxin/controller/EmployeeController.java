package com.zhouxin.controller;

import com.zhouxin.domain.Dept;
import com.zhouxin.domain.Employee;
import com.zhouxin.service.DeptService;
import com.zhouxin.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/employee")    // 设置一级目录
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    /**
     * 查询所有员工信息
     *
     * @param model
     * @return
     */
    @RequestMapping("/findAll")
    public String findAll(Model model) {

        List<Employee> list = employeeService.findAll();

        //  把封装好的list封装到model中
        model.addAttribute("list", list);

        return "list";

    }

    @RequestMapping("/save")
    public String save(Employee employee){

        employeeService.save(employee);

        // 跳转到findAll方法重新查询一次数据库，进行数据的遍历展示
        return "redirect:/employee/findAll";

    }

}
