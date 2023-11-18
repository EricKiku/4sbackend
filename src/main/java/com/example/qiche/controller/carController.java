package com.example.qiche.controller;

import com.example.qiche.mapper.carMapper;
import com.example.qiche.pojo.Car;
import com.example.qiche.pojo.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/car")
public class carController {
    @Autowired
    private carMapper carMapper;

    @GetMapping("/get")
    public Response<List<Car>> getCar(){
        List<Car> allCar = carMapper.getAllCar();
        return new Response<>(200,"查询成功",allCar);
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Response addCar(@RequestBody Map<String, String> params){
        boolean insert = carMapper.addCar(params.get("brand"), params.get("model"), params.get("config"), params.get("color"), params.get("gear"), params.get("count"), params.get("price"));
        if (insert){
            return new Response<>(200,"添加成功");
        }else{
            return new Response<>(401,"添加失败");
        }
    }

    //删除车型
    @RequestMapping(value = "/del",method = RequestMethod.DELETE)
    public Response del(@RequestBody Map<String,String> data){
        boolean b = carMapper.delCar(data.get("cid"));
        if (b){
            return new Response(200,"删除成功");
        }else{
            return new Response(401,"删除失败");
        }
    }
}
