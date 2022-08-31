package com.example.mybatis_demo2.domain;

import java.sql.Timestamp;

/**
 * TODO .
 * @author <a href="mailto:guyue375@outlook.com">Klaus.turbo</a>
 * @program demo002
 **/
public class User {
    
    private Integer id;
    
    private Integer age;
    
    private String name;
    
    private String sex;
    
    private Timestamp birth;
    
    private Timestamp create_time;
    
    private String create_by;
    
    
    public Integer getId() {
        return id;
    }
    
    public int getage() {
        return age;
    }
    
    
    public void setAge(Integer age) {
        this.age = age;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getSex(String sex) {
        return sex;
    }
    
    public void setSex(String sex) {
        this.sex = sex;
    }
    
    public Timestamp getBirth() {
        return birth;
    }
    
    
    public void setBirth(Timestamp birth) {
        this.birth = birth;
    }
    
    public String getCreate_by() {
        return create_by;
    }
    
    public void setCreate_by(String create_by) {
        this.create_by = create_by;
    }
    
    public Timestamp getCreat_time( Timestamp creat_time) {
        return create_time;
    }
    
    public void setCreate_time(Timestamp create_time) {
        this.create_time = create_time;
    }
    
    
    @Override
    public String toString() {
        return "User{" + "id=" + id + ", username='" + name + '\'' + ", birthday=" + birth + ", sex='" + sex + '\''
                + ", address='" + create_by + '\'' + ",creattinme" + create_time + ",age" + age;
    }
}
    



    
