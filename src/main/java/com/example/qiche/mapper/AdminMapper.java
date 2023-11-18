package com.example.qiche.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.qiche.pojo.Admin;
import org.apache.ibatis.annotations.Delete;

public interface AdminMapper extends BaseMapper<Admin> {
    @Delete("DELETE FROM admin WHERE a_id = ${aid}")
    boolean delAdmin(String aid);
}
