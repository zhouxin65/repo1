package com.zhouxin.test;

import com.zhouxin.dao.DeptDao;
import com.zhouxin.dao.EmployeeDao;
import com.zhouxin.domain.Dept;
import com.zhouxin.domain.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class EmployeeTest {

    @Test
    public void testFindAll() throws IOException {

        // 加载核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        // 获取sqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        // 获取sqlSession会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 获取Mapper代理对象
        EmployeeDao mapper = sqlSession.getMapper(EmployeeDao.class);

        // 执行查询方法
        List<Employee> all = mapper.findAll();
        for (Employee employee : all) {

            System.out.println(employee);

        }

        // 释放资源
        sqlSession.close();

    }

    @Test
    public void testSave() {
        SqlSession sqlSession = null;

        try {
            // 加载核心配置文件
            InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");
            // 获取sqlSessionFactory对象
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
            // 获取sqlSession会话对象
            sqlSession = sqlSessionFactory.openSession();
            // 获取Mapper代理对象
            EmployeeDao mapper = sqlSession.getMapper(EmployeeDao.class);

            // 执行添加方法
            Employee employee = new Employee();
            employee.setEmp_name("张三");
            employee.setDept_id(2);
            employee.setJob_name("销售经理");
            employee.setJoin_date(new Date("1998/3/1"));
            employee.setTelephone("12345665432");

            mapper.save(employee);
            // 提交事务
            sqlSession.commit();
            System.out.println("添加成功！！");

        } catch (IOException e) {
            e.printStackTrace();
            // 回滚事务
            sqlSession.rollback();
            System.out.println("添加失败！！");

        } finally {

            // 释放资源
            sqlSession.close();

        }


    }

}
