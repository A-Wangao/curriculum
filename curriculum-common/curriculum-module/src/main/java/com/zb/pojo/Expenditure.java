package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Expenditure implements Serializable {
    //主键
    private Long id;
    //用户
    private Long userId;
    //支出
    private Double expenditure;
    //支出时间
    private Date zhichutime;
    //备注
    private String remarks;
    //途径(钱花在什么上面了)
    private String paychannel;
    //支付方式(1:支付宝2：余额3：积分)
    private Integer method;
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
    public void setExpenditure (Double  expenditure){
        this.expenditure=expenditure;
    }
    public  Double getExpenditure(){
        return this.expenditure;
    }
    public void setZhichutime (Date  zhichutime){
        this.zhichutime=zhichutime;
    }
    public  Date getZhichutime(){
        return this.zhichutime;
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
}
