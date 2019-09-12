package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Income implements Serializable {
    //主键
    private Long Id;
    //用户
    private Long userId;
    //收入
    private Double income;
    //收入时间
    private Date shourutime;
    //备注
    private String remarks;
    //收入途径
    private String inchannel;
    //充值类型(1获取的积分2充值的余额)
    private Integer Intype;
    //get set 方法
    public void setId (Long  Id){
        this.Id=Id;
    }
    public  Long getId(){
        return this.Id;
    }
    public void setUserId (Long  userId){
        this.userId=userId;
    }
    public  Long getUserId(){
        return this.userId;
    }
    public void setIncome (Double  income){
        this.income=income;
    }
    public  Double getIncome(){
        return this.income;
    }
    public void setShourutime (Date  shourutime){
        this.shourutime=shourutime;
    }
    public  Date getShourutime(){
        return this.shourutime;
    }
    public void setRemarks (String  remarks){
        this.remarks=remarks;
    }
    public  String getRemarks(){
        return this.remarks;
    }
    public void setInchannel (String  inchannel){
        this.inchannel=inchannel;
    }
    public  String getInchannel(){
        return this.inchannel;
    }
    public void setIntype (Integer  Intype){
        this.Intype=Intype;
    }
    public  Integer getIntype(){
        return this.Intype;
    }
}
