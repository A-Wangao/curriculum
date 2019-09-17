package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Integral implements Serializable {
    //主键
    private Integer id;
    //用户
    private Integer userId;
    //用户积分
    private Integer userintegral;
    //获取途径(0：活动1：充钱2：正常)
    private Integer access;
    //获取日期
    private Date getdate;
    //使用日期
    private Date usedate;
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
    public void setUserintegral (Integer  userintegral){
        this.userintegral=userintegral;
    }
    public  Integer getUserintegral(){
        return this.userintegral;
    }
    public void setAccess (Integer  access){
        this.access=access;
    }
    public  Integer getAccess(){
        return this.access;
    }
    public void setGetdate (Date  getdate){
        this.getdate=getdate;
    }
    public  Date getGetdate(){
        return this.getdate;
    }
    public void setUsedate (Date  usedate){
        this.usedate=usedate;
    }
    public  Date getUsedate(){
        return this.usedate;
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
