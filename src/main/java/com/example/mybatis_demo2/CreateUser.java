package com.example.mybatis_demo2;

import com.example.mybatis_demo2.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * TODO .
 * @author <a href="mailto:guyue375@outlook.com">Klaus.turbo</a>
 * @program mybatis_demo2
 **/
public class CreateUser extends UserOperator{
    
    public static void main(String[] args) throws IOException {
       
        SqlSession session =buildSession();
        Date date=new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        User user = new User();
        user.setId(11);
        user.setName("宫威");
        user.setSex("男");
        user.setAge(23);
        user.setCreate_by("宫威");
        user.setBirth(Timestamp.valueOf("2022-08-15 13:24:05"));
        user.setCreate_time(Timestamp.valueOf(dateFormat.format(date)));
        session.insert("com.example.mybatis_demo2.dao.IUserDao.addUser", user);
        session.commit();
        session.close();
        System.out.println(user);
    }
    
    public static void  createUser(){
    
    }
    
    public static void  createUser(Integer age){
    
    }
    
    public static void  createUser(String name){
    
    }
}
    
