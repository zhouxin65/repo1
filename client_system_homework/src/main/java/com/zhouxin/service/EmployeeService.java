package com.zhouxin.service;

import com.zhouxin.domain.Employee;

import java.util.List;

/**
 * 员工 service层
 */
public interface EmployeeService {

    /**
     * 查询所有员工信息
     */
    List<Employee> findAll();

    /**
     * 新增员工方法
     */
    void save(Employee employee);

}
