package com.linlang.mall.vo;

import lombok.Data;

@Data
public class UserInfoVo {

    private String cid;
    private String username;
    private String phone;
    private String type;
    private String status;
    private String channel;
    private String createtime;
    private String updatetime;

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCid() {
        return cid;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getChannel() {
        return channel;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
    }

    public String getUpdatetime() {
        return updatetime;
    }
}
