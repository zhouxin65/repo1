package com.zhouxin.service.impl;

import com.zhouxin.dao.DeptDao;
import com.zhouxin.domain.Dept;
import com.zhouxin.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;

    @Override
    public List<Dept> findAll() {

        List<Dept> all = deptDao.findAll();

        return all;
    }

    @Override
    public Dept findById(Integer dept_id) {

        Dept dept = deptDao.findById(dept_id);

        return dept;
    }
}
