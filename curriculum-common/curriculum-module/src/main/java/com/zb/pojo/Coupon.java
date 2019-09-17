package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Coupon implements Serializable {
    //主键
    private Integer id;
    //用户
    private Integer userId;
    //金额(50积分：15元 100积分：30元 150积分：50元)
    private Integer money;
    //到期时间
    private Date maturitytime;
    //状态
    private Integer state;
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
    public void setMoney (Integer  money){
        this.money=money;
    }
    public  Integer getMoney(){
        return this.money;
    }
    public void setMaturitytime (Date  maturitytime){
        this.maturitytime=maturitytime;
    }
    public  Date getMaturitytime(){
        return this.maturitytime;
    }
    public void setState (Integer  state){
        this.state=state;
    }
    public  Integer getState(){
        return this.state;
    }
    public void setCreateTime (Date  createTime){
        this.createTime=createTime;
    }
    public  Date getCreateTime(){
        return this.createTime;
    }
}
