package com.zhouxin.test;

import com.zhouxin.domain.Employee;
import com.zhouxin.service.EmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class EmployeeServiceTest {

    @Autowired
    private EmployeeService employeeService;

    @Test
    public void testFindAll(){

        List<Employee> all = employeeService.findAll();
        for (Employee employee : all) {

            System.out.println(employee);

        }

    }

    @Test
    public void testSave(){

        Employee employee = new Employee();
        employee.setEmp_name("李四");
        employee.setDept_id(1);
        employee.setJob_name("销售经理");
        employee.setJoin_date(new Date("1999/6/1"));
        employee.setTelephone("12345665111");

        employeeService.save(employee);


    }

}
