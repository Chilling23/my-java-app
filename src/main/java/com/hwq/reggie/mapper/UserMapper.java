package com.hwq.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hwq.reggie.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User>{
}
