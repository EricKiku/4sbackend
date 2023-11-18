package com.example.qiche.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.qiche.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@Mapper
public interface UserMapper extends BaseMapper<User> {

    @Select("SELECT * FROM user")
    List<User> getAll();
    @Select("SELECT * FROM user WHERE u_email = '${email}' AND u_pwd = '${pwd}'")
    Map<String, Object> login(String email, String pwd);

    // 用户注册
    @Insert("INSERT INTO user(u_email,u_pwd)VALUES ('${email}','${pwd}')")
    boolean register(String email,String pwd);
}
