package com.example.mybatis_demo2;

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
public class DeleteUser {
    
    public static void main(String[] args) throws IOException {
        InputStream in=Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
        SqlSessionFactory factory=builder.build(in);
        SqlSession session= factory.openSession();
        session.delete("com.example.mybatis_demo2.dao.IUserDao.DeleteUser",7);
        session.commit();
        session.close();
    
    }
}
