package com.example.qiche.controller;

import com.example.qiche.mapper.UserMapper;
import com.example.qiche.pojo.Response;
import com.example.qiche.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/user")
public class userController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/get")
    public Response<List<User>> allUser(){
        List<User> users = userMapper.getAll();
        return new Response<>(200,"获取成功",users);
    }

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public Response login(String email,String pwd){
        Map<String, Object> user = userMapper.login(email, pwd);
        System.out.println(user);
        if (user==null){
            return new Response(401,"登录失败");
        }else{
            return new Response(200,"登录成功",user);
        }
    }

    // 注册
    @RequestMapping(value = "/reg",method = RequestMethod.POST)
    public Response reg(@RequestBody Map<String, String> params){
        String email = params.get("email");
        String pwd = params.get("pwd");
        boolean register = userMapper.register(email, pwd);
        if (register){
            return new Response(200,"注册成功");
        }else{
            return new Response(401,"注册失败");
        }
    }
}
