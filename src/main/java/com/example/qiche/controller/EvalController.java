package com.example.qiche.controller;

import com.example.qiche.mapper.EvalMapper;
import com.example.qiche.pojo.Eval;
import com.example.qiche.pojo.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/eval")
public class EvalController {
    @Autowired
    private EvalMapper evalMapper;

    // 获取所有评价
    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public Response<List<Eval>> get(){
        List<Eval> evals = evalMapper.selectList(null);
        return new Response(200,"获取成功",evals);
    }

    // 添加评价
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Response add(@RequestBody Eval eval){
        int insert = evalMapper.insert(eval);
        if (insert==1){
            return new Response(200,"添加成功");
        }else{
            return new Response(401,"添加失败");
        }
    }
}
