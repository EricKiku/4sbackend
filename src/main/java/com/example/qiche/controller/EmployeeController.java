package com.example.qiche.controller;

import com.example.qiche.mapper.EmployeeMapper;
import com.example.qiche.pojo.Employee;
import com.example.qiche.pojo.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {
    @Autowired
    private EmployeeMapper employeeMapper;

    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public Response<List<Employee>> get(){
        List<Employee> employees = employeeMapper.selectList(null);
        return new Response(200,"查询成功",employees);
    }

    // 添加员工
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Response add(@RequestBody Map<String, String> params){
        Employee employee = new Employee();
        employee.seteJobnumber(params.get("jobnumber"));
        employee.seteName(params.get("name"));
        employee.seteGender(params.get("gender"));
        employee.seteAge(params.get("age"));
        employee.setePhone(params.get("phone"));
        employee.seteAddress(params.get("address"));
        employee.seteJointime(params.get("date"));
        int insert = employeeMapper.insert(employee);
        System.out.println(insert);
        if (insert==1){
            return new Response(200,"添加成功");
        }else{
            return new Response(401,"添加失败");
        }
    }

    // 删除
    @RequestMapping(value = "/del",method = RequestMethod.DELETE)
    public Response del(@RequestBody Map<String,String> data){
        boolean b = employeeMapper.delEmp(data.get("eid"));
        if (b){
            return new Response(200,"删除成功");
        }else{
            return new Response(200,"删除失败");
        }
    }
}
