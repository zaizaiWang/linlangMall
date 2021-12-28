package com.linlang.mall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.linlang.mall.entity.UserMainInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserInfoMapper extends BaseMapper<UserMainInfo> {

    @Select("select * from user_main_info where cid = #{userId}")
    public UserMainInfo getUserInfo(@Param("userId")String userId);

}
