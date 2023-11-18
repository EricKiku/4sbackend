package com.example.qiche.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.qiche.pojo.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface loginMapper extends BaseMapper<Admin> {

    @Select("SELECT a_name,a_email FROM admin WHERE a_email = '${email}' AND a_pwd = '${pwd}'")
    List<Map<String,String>> query(String email, String pwd);
}
