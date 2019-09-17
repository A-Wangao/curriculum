package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Expenditure implements Serializable {
    //主键
    private Integer id;
    //用户
    private Integer userId;
    //支出
    private Double expenditure;
    //支出时间
    private Date zhichuTime;
    //备注
    private String remarks;
    //途径(钱花在什么上面了)
    private String paychannel;
    //支付方式(1:支付宝2：余额3：积分)
    private Integer method;
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
    public void setExpenditure (Double  expenditure){
        this.expenditure=expenditure;
    }
    public  Double getExpenditure(){
        return this.expenditure;
    }
    public void setZhichuTime (Date  zhichuTime){
        this.zhichuTime=zhichuTime;
    }
    public  Date getZhichuTime(){
        return this.zhichuTime;
    }
    public void setRemarks (String  remarks){
        this.remarks=remarks;
    }
    public  String getRemarks(){
        return this.remarks;
    }
    public void setPaychannel (String  paychannel){
        this.paychannel=paychannel;
    }
    public  String getPaychannel(){
        return this.paychannel;
    }
    public void setMethod (Integer  method){
        this.method=method;
    }
    public  Integer getMethod(){
        return this.method;
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
