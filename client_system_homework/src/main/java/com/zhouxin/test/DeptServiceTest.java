package com.zhouxin.test;

import com.zhouxin.domain.Dept;
import com.zhouxin.service.DeptService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class DeptServiceTest {

    @Autowired
    private DeptService deptService;

    @Test
    public void testFindAll(){

        List<Dept> all = deptService.findAll();
        for (Dept dept : all) {

            System.out.println(dept);

        }

    }

    @Test
    public void testFindById(){

        Dept dept = deptService.findById(1);

        System.out.println(dept);

    }


}
