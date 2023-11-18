package com.example.qiche.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.qiche.pojo.Upkeep;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UpkeepMapper extends BaseMapper<Upkeep> {

    @Insert("INSERT INTO upkeep(u_id,c_id,uk_mileage,uk_type,uk_number,uk_date,uk_description)VALUES ('${uId}','${cId}','${meileage}','${type}','${number}','${date}','${description}')")
    boolean addUk(String uId,String cId,String meileage,String type,String number ,String date,String description);

    // 删除
    @Delete("DELETE FROM upkeep WHERE uk_id = ${ukid}")
    boolean deleteUk(String ukid);
}
