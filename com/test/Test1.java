package com.test;

import com.dao.AddressDao;
import com.dao.CategoryDao;
import com.dao.StoreDao;
import com.dao.UserDao;
import com.pojo.Address;
import com.pojo.User;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        //demo1(applicationContext);
        //demo2();
        //demo3(applicationContext);
        //demo4(applicationContext);
        //demo5(applicationContext);
        AddressDao addressDao = (AddressDao) applicationContext.getBean("addressDao");
        Address address = new Address();
        address.setUser_id(1);
        address.setName("张三");
        address.setGender("男");

       // addressDao.insert(address);
        System.out.println(addressDao.getAddressByUserId(1));
    }

    private static void demo5(ApplicationContext applicationContext) {
        StoreDao storeDao = (StoreDao) applicationContext.getBean("storeDao");
        System.out.println(storeDao.getStoreByStoreName("香"));
    }

    private static void demo4(ApplicationContext applicationContext) {
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        User user = userDao.getUserByName("maoliyu");
        System.out.println(user);
    }

    private static void demo3(ApplicationContext applicationContext) {
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        User user = new User();
        user.setUserName("maoliyu");
        user.setUserPassword("123");
        userDao.insert(user);
    }

    private static void demo2() {
        //StoreDao storeDao = (StoreDao) applicationContext.getBean("storeDao");
        //UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        //System.out.println(storeDao.getTotal());*/
        // CategoryDao categoryDao = (CategoryDao) applicationContext.getBean("categoryDao");
        //System.out.println(categoryDao.getCategoryById(1));
        //System.out.println(categoryDao.getList(0,Integer.MAX_VALUE));
        // System.out.println(storeDao.getStoreById(1));
        //System.out.println(storeDao.getStoreListByCategoryId(5));
        //System.out.println(userDao.login("222","222"));
    }

    private static void demo1(ApplicationContext applicationContext) {
        SqlSessionFactory sqlSessionFactory = (SqlSessionFactory) applicationContext.getBean("sqlSessionFactory");
        System.out.println(sqlSessionFactory);
    }
}
