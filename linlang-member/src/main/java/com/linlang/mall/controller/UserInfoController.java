package com.linlang.mall.controller;

import com.linlang.mall.entity.UserMainInfo;
import com.linlang.mall.service.UserInfoService;
import com.linlang.mall.util.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *
 */
@Api("用户信息")
@RestController
@RequestMapping(value = "/userInfo")
public class UserInfoController {

    @Autowired
    UserInfoService userInfoService;

    @ApiOperation("新增用户信息")
    @PostMapping("/saveUserInfo")
    @ResponseBody
    public Result saveUserInfo(UserMainInfo userMainInfo){
        int i = userInfoService.saveUserInfo(userMainInfo);
        Result result = new Result();
        result.setCode(00);
        if(i==0){
            result.setMsg("保存失败");
        }else {
            result.setMsg("保存成功");
        }
        return result;
    }

    @ApiOperation("查询用户信息")
    @GetMapping(value = "/queryUSerInfo/{userId}")
    public Result<UserMainInfo> queryUserInfo(@PathVariable("id")String userId){
        UserMainInfo userMainInfo = userInfoService.queryUserInfo(userId);
        Result result = new Result();
        result.setCode(00);
        result.setMsg("查询成功");
        result.setData(userMainInfo);
        return result;
    }
}
