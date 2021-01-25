package com.zhouxin.dao;

import com.zhouxin.domain.Dept;

import java.util.List;

/**
 * 部门表  Dap层方法
 */
public interface DeptDao {

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
