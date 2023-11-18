package com.example.qiche.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.qiche.pojo.Testdrive;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface TestDriveMapper extends BaseMapper<Testdrive> {

    @Select("SELECT * FROM testdrive")
    List<Testdrive> getAll();

    // 增加试驾
    @Insert("INSERT INTO testdrive(td_name,td_gender,td_phone,td_province,td_city,td_dealer,td_date,td_model)VALUES ('${name}','${gender}','${phone}','${province}','${city}','${dealer}','${date}','${model}')")
    boolean addTestDrive(String name,String gender,String phone, String province,String city,String dealer,String date,String model);
    // 删除试驾
    @Delete("DELETE FROM testdrive WHERE td_id = ${tdid}")
    boolean delTd(String tdid);
}
