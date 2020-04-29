package com.lagou.test;

import com.lagou.mapper.IOrderMapper;
import com.lagou.mapper.IUserMapper;
import com.lagou.pojo.Order;
import com.lagou.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class mybatisTest {
    @Test
    public void test() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        IUserMapper mapper = sqlSession.getMapper(IUserMapper.class);
        List<Order> orderAndUser = mapper.findOrderAndUser();
        for (Order order : orderAndUser) {
            System.out.println(order.toString());
        }
        sqlSession.close();

    }

    @Test
    public void test2() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        IOrderMapper mapper = sqlSession.getMapper(IOrderMapper.class);
        List<User> userAndOrders = mapper.findUserAndOrder();
        for (User order : userAndOrders) {
            System.out.println(order.toString());
        }
        sqlSession.close();

    }

}
