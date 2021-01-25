package com.zhouxin.service.impl;

import com.zhouxin.dao.EmployeeDao;
import com.zhouxin.domain.Employee;
import com.zhouxin.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public List<Employee> findAll() {

        List<Employee> list = employeeDao.findAll();

        return list;

    }

    @Override
    public void save(Employee employee) {

        employeeDao.save(employee);

    }
}
