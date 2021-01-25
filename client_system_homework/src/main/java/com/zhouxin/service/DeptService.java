package com.zhouxin.service;

import com.zhouxin.domain.Dept;

import java.util.List;

/**
 * 部门 service层
 */
public interface DeptService {

    /**
     * 查询所有部门信息
     *
     * @return
     */
    List<Dept> findAll();

    /**
     * 根据Id查询部门信息
     *
     * @param dept_id
     * @return
     */
    Dept findById(Integer dept_id);

}
