package com.linlang.mall.controller;

import com.linlang.mall.util.Result;
import com.linlang.mall.vo.UserInfoVo;
import org.springframework.web.bind.annotation.*;

/**
 *
 */
@RestController
@RequestMapping(value = "/userInfo")
public class UserInfoController {

    @GetMapping(value = "/queryUSerInfo/{userId}")
    public Result<UserInfoVo> queryUserInfo(@PathVariable("id")String userId){
        return null;
    }
}
