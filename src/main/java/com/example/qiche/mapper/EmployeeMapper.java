package com.example.qiche.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.qiche.pojo.Employee;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
    @Delete("DELETE FROM employee WHERE e_id = ${eid}")
    boolean delEmp(String eid);
}
