package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Coupon implements Serializable {
    //主键
    private Long id;
    //用户
    private Long userId;
    //金额(50积分：15元 100积分：30元 150积分：50元)
    private Integer money;
    //到期时间
    private Date maturitytime;
    //状态
    private Integer state;
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
}
