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
public class UpdateUser {
    
    public static void main(String[] args) throws IOException {
        SqlSession session=SqlSessionUtil.build();
        User user=new User();
        user.setId(4);
        user.setSex("男");
        user.setName("宫威");
       int inseart;
        inseart = session.update("com.example.mybatis_demo2.dao.IUserDao.UpdateUser",user);
        
        session.commit();
        session.close();
        System.out.println(inseart);
    }
}
