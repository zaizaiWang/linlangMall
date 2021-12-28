package com.linlang.mall.util;

public enum State {
    RET_STATE_SUCCESS(0, "请求成功"),
    RET_STATE_FAILED(1, "账号或密码错误，请求失败"),
    RET_STATE_SYSTEM_ERROR(2, "系统异常"),
    RET_STATE_PARAM_ERROR(3, "提交参数异常"),
    RET_STATE_TOKEN_TIMEOUT(4, "用户长时间未操作，请重新登录"),
    USER_IS_EXIST(6, "用户已存在"),
    USER_NOT_EXIST(7, "用户不存在"),
    USER_FREEZE(8, "账号已冻结"),
    RULE_IS_EXIST(9, "角色已存在"),
    OVERTIME(10, "超时"),
    IS_EXIST(11, "已存在"),
    USER_VCODE(12, "验证码不正确"),
    RET_STATE_POINT_OFFLINE(13, "监控点不在线"),
    USER_NOT_DEADLINE(14, "用户已过期"),
    FILE_IS_EXISTS(15, "文件已存在"),
    ENTERPRISE_NAME(16, "已存在企业名称"),
    USER_IS_MESSAGE(17, "登录账号或手机号码已存在"),
    POIN_IS_NAME_MN(18, "监控点mn号已存在"),
    REQUIRED(19, "必填项有空值"),
    USER_IS_DELETE(20, "用户已经被删除"),
    CONTRACT_NUMBER_IS_EXIST(21, "合同编号已存在"),
    PHONE_BINDING_WECHAT_CODE_ERROR(22, "手机号绑定微信公众号验证码错误"),
    USER_NOT_ACTIVATED(23, "用户未激活");

    private int state;
    private String msg;

    private State(int number, String description) {
        this.state = number;
        this.msg = description;
    }

    public int getState() {
        return this.state;
    }

    public String getMsg() {
        return this.msg;
    }
}