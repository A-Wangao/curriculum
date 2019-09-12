package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Integral implements Serializable {
    //主键
    private Long id;
    //用户
    private Long userId;
    //用户积分
    private Integer userintegral;
    //获取途径(0：活动1：充钱2：正常)
    private Integer access;
    //获取日期
    private Date getdate;
    //使用日期
    private Date usedate;
    //get set 方法
    public void setId (Long  id){
        this.id=id;
    }
    public  Long getId(){
        return this.id;
    }
    public void setUserId (Long  userId){
        this.userId=userId;
    }
    public  Long getUserId(){
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
}
