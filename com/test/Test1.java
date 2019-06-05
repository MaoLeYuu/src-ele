package com.test;

import com.dao.CategoryDao;
import com.dao.StoreDao;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        //demo1(applicationContext);
        /*StoreDao storeDao = (StoreDao) applicationContext.getBean("storeDao");
        System.out.println(storeDao.getTotal());*/
        CategoryDao categoryDao = (CategoryDao) applicationContext.getBean("categoryDao");
        //System.out.println(categoryDao.getCategoryById(1));
        System.out.println(categoryDao.getList(0,Integer.MAX_VALUE));

    }

    private static void demo1(ApplicationContext applicationContext) {
        SqlSessionFactory sqlSessionFactory = (SqlSessionFactory) applicationContext.getBean("sqlSessionFactory");
        System.out.println(sqlSessionFactory);
    }
}
