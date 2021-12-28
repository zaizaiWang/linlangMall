package com.linlang.mall.service;

import com.linlang.mall.entity.UserMainInfo;
import com.linlang.mall.mapper.UserInfoMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserInfoService {

    @Autowired
    UserInfoMapper userInfoMapper;

    public int saveUserInfo(UserMainInfo userMainInfo){
        int i = userInfoMapper.insert(userMainInfo);
        if(i == 1){
            return 1;
        }else{
            return 0;
        }
    }

    public UserMainInfo queryUserInfo(String userId){
        return userInfoMapper.getUserInfo(userId);
    }
}
