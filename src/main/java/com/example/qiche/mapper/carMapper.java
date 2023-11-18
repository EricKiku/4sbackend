package com.example.qiche.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.qiche.pojo.Car;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface carMapper extends BaseMapper<Car> {
    @Select("SELECT * FROM car")
    List<Car> getAllCar();

    @Insert("INSERT INTO car(c_brand,c_model,c_config,c_color,c_gear,c_count,c_price)VALUES ('${brand}','${model}','${config}','${color}','${gear}','${count}','${price}')")
    boolean addCar(String brand,String model,String config,String color,String gear,String count,String price);

    // 删除根据cid
    @Delete("DELETE FROM car WHERE c_id = ${cid}")
    boolean delCar(String cid);
}
