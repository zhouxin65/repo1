package com.zhouxin.dao;

import com.zhouxin.domain.Employee;

import java.util.List;

/**
 *  员工表 dao层
 */
public interface EmployeeDao {

    /**
     * 查询所有员工信息
     */
    List<Employee> findAll();

    /**
     * 新增员工方法
     */
    void save(Employee employee);

}
