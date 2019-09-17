package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Teacherapply implements Serializable {
    //主键
    private Integer id;
    //用户id
    private Integer userId;
    //真实姓名
    private String realname;
    //简介
    private String introduction;
    //数据状态
    private Integer status;
    //添加时间
    private Date createTime;
    //get set 方法
    public void setId (Integer  id){
        this.id=id;
    }
    public  Integer getId(){
        return this.id;
    }
    public void setUserId (Integer  userId){
        this.userId=userId;
    }
    public  Integer getUserId(){
        return this.userId;
    }
    public void setRealname (String  realname){
        this.realname=realname;
    }
    public  String getRealname(){
        return this.realname;
    }
    public void setIntroduction (String  introduction){
        this.introduction=introduction;
    }
    public  String getIntroduction(){
        return this.introduction;
    }
    public void setStatus (Integer  status){
        this.status=status;
    }
    public  Integer getStatus(){
        return this.status;
    }
    public void setCreateTime (Date  createTime){
        this.createTime=createTime;
    }
    public  Date getCreateTime(){
        return this.createTime;
    }
}
