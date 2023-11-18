package com.example.qiche.controller;

import com.example.qiche.mapper.UpkeepMapper;
import com.example.qiche.pojo.Response;
import com.example.qiche.pojo.Upkeep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/uk")
public class UpkeepController {

    @Autowired
    private UpkeepMapper upkeepMapper;

    //获取所有预约保养
    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public Response<List<Upkeep>> allUk(){
        List<Upkeep> upkeeps = upkeepMapper.selectList(null);
        return new Response<>(200,"查询成功",upkeeps);

    }

    // 预约保养
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Response yuyueUk(@RequestBody Map<String, String> params){
        String uId = params.get("uid");
        String cId = params.get("cid");
        String meileage = params.get("mileage");
        String type = params.get("type");
        String number = params.get("number");
        String date = params.get("date");
        String description = params.get("description");
        boolean b = upkeepMapper.addUk(uId, cId, meileage, type, number, date, description);
        if (b){
            return new Response(200,"预约成功");
        }else{
            return new Response(401,"预约失败");
        }

    }

    // 删除根据uk_id
    @RequestMapping(value = "/del",method = RequestMethod.DELETE)
    public Response del(@RequestBody Map<String,String> data){
        boolean b = upkeepMapper.deleteUk(data.get("ukid"));
        if (b){
            return new Response(200,"删除成功");
        }else{
            return new Response(401,"删除失败");
        }
    }
}
