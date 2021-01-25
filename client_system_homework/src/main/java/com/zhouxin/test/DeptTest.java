package com.zhouxin.test;

import com.zhouxin.dao.DeptDao;
import com.zhouxin.domain.Dept;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * 查询部门信息方法测试
 */
public class DeptTest {

    @Test
    public void testFindAll() throws IOException {

        // 加载核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        // 获取sqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        // 获取sqlSession会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 获取Mapper代理对象
        DeptDao mapper = sqlSession.getMapper(DeptDao.class);

        // 执行查询方法
        List<Dept> all = mapper.findAll();
        for (Dept dept : all) {

            System.out.println(dept);

        }

        // 释放资源
        sqlSession.close();

    }

    @Test
    public void testFindById() throws IOException {

        // 加载核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        // 获取sqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        // 获取sqlSession会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 获取Mapper代理对象
        DeptDao mapper = sqlSession.getMapper(DeptDao.class);

        // 执行查询方法
        Dept dept = mapper.findById(1);
        System.out.println(dept);

        // 释放资源
        sqlSession.close();

    }

}
