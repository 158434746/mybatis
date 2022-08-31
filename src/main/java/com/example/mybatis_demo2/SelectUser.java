package com.example.mybatis_demo2;

import com.example.mybatis_demo2.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * TODO .
 * @author <a href="mailto:guyue375@outlook.com">Klaus.turbo</a>
 * @program mybatis_demo2
 **/
public class SelectUser extends UserOperator{

    public static void main(String[] args) throws IOException {
        SqlSession sqlSession =buildSession();
        User user= new User();
         user=sqlSession.selectOne("com.example.mybatis_demo2.dao.IUserDao.findAll",1);
        System.out.println(user);
        sqlSession.close();
        
    }
}
