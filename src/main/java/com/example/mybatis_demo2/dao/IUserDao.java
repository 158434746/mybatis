package com.example.mybatis_demo2.dao;

/**
 * TODO .
 * @author <a href="mailto:guyue375@outlook.com">Klaus.turbo</a>
 * @program demo002
 **/

import com.example.mybatis_demo2.domain.User;
import com.mysql.cj.x.protobuf.MysqlxCrud;

import java.util.List;

public interface IUserDao {
    
    void findAll(User user);
//    User findAll ( int ids);
    void addUser(User user);
    
    void UpdateUser(User user) ;
    
    void DeleteUser(User user);

    
    
}

