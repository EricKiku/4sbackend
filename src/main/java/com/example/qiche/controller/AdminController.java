package com.example.qiche.controller;

import com.example.qiche.mapper.AdminMapper;
import com.example.qiche.pojo.Admin;
import com.example.qiche.pojo.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/admin")
public class AdminController {
    @Autowired
    private AdminMapper adminMapper;

    @RequestMapping(value = "/get")
    public Response get(){
        List<Admin> admins = adminMapper.selectList(null);
        return new Response(200,"查询成功",admins);
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Response add(@RequestBody Admin admin){
        int insert = adminMapper.insert(admin);
        if (insert==1){
            return new Response(200,"添加成功");
        }else{
            return new Response(401,"添加失败");
        }
    }

    // 删除管理员
    @RequestMapping(value = "/del",method = RequestMethod.DELETE)
    public Response del(@RequestBody Map<String,String> data){
        boolean b = adminMapper.delAdmin(data.get("aid"));
        if (b){
            return new Response(200,"删除成功");
        }else{
            return new Response(401,"删除失败");
        }
    }
}
