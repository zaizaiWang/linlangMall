package com.linlang.mall.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel
@Data
@TableName(value = "user_main_info")
public class UserMainInfo {

  @ApiModelProperty("用户ID")

  private String cid;
  @ApiModelProperty("用户名")
  private String username;
  @ApiModelProperty("用户手机号")
  private String phone;
  @ApiModelProperty("用户类型")
  private String type;
  @ApiModelProperty("用户状态")
  private String status;
  @ApiModelProperty("用户来源渠道")
  private String channel;
  @ApiModelProperty("用户创建时间")
  private String createtime;
  @ApiModelProperty("用户信息修改时间")
  private String updatetime;

  public String getCid() {
    return cid;
  }

  public void setCid(String cid) {
    this.cid = cid;
  }


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public String getChannel() {
    return channel;
  }

  public void setChannel(String channel) {
    this.channel = channel;
  }


  public String getCreatetime() {
    return createtime;
  }

  public void setCreatetime(String createtime) {
    this.createtime = createtime;
  }


  public String getUpdatetime() {
    return updatetime;
  }

  public void setUpdatetime(String updatetime) {
    this.updatetime = updatetime;
  }

}
