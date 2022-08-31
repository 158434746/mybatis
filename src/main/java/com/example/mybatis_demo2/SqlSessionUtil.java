package com.example.mybatis_demo2;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * 工具类 .
 * @author <a href="mailto:guyue375@outlook.com">Klaus.turbo</a>
 * @program mybatis_demo2
 **/
public class SqlSessionUtil {
    
    public static SqlSession build(){
        InputStream in = null;
        try {
            in = Resources.getResourceAsStream("SqlMapConfig.xml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        SqlSessionFactory build= new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession=build.openSession();
        return sqlSession;
    }
    
}
