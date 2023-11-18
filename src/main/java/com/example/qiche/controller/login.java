package com.example.qiche.controller;

import com.example.qiche.mapper.loginMapper;
import com.example.qiche.pojo.Admin;
import com.example.qiche.pojo.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/login")
public class login {

    @Autowired
    private loginMapper loginMapper;
    @GetMapping("/")
    public Response<List<Map<String,String>>> loginApi(String email,String pwd,Integer rememberpwd){
        List<Map<String, String>> query = loginMapper.query(email, pwd);
        System.out.println(CollectionUtils.isEmpty(query));
        boolean isEmpty = CollectionUtils.isEmpty(query);
        //如果不为空，则说明有该管理员，则登录
        if (!isEmpty){
            return new Response<>(200, "登录成功", query);
        }else{
            return new Response<>(401, "没有该账号或密码错误");
        }

    }
}
