package com.example.qiche.controller;

import com.example.qiche.mapper.TestDriveMapper;
import com.example.qiche.pojo.Response;
import com.example.qiche.pojo.Testdrive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/testdrive")
public class TestDriveController {
    @Autowired
    private TestDriveMapper testDriveMapper;

    // 获取所有试驾数据
    @RequestMapping(value = "/get")
    public Response<List<Testdrive>> get(){
        List<Testdrive> all = testDriveMapper.getAll();
        return new Response<>(200, "获取成功", all);
    }

    // 新增试驾
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Response add(@RequestBody Map<String, String> params){
        //String name,String gender,String phone, String province,String city,String dealer,String date,String model
        String name = params.get("name");
        String gender = params.get("gender");
        String phone = params.get("phone");
        String province = params.get("province");
        String city = params.get("city");
        String dealer = params.get("dealer");
        String date = params.get("date");
        String model = params.get("model");
        boolean b = testDriveMapper.addTestDrive(name, gender, phone, province, city, dealer, date, model);
        if (b){
            return new Response(200,"预约成功");
        }else{
            return new Response(401,"预约失败");
        }
    }

    // 删除
    @RequestMapping(value = "/del" ,method = RequestMethod.DELETE)
    public Response del(@RequestBody Map<String,String> data){
        boolean b = testDriveMapper.delTd(data.get("tdid"));
        if (b){
            return new Response(200,"删除成功");
        }else{
            return new Response(401,"删除失败");
        }
    }
}
