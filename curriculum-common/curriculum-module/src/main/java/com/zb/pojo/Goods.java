package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Goods implements Serializable {
    //主键
    private Integer id;
    //订单编号
    private Integer orderId;
    //订单时间
    private Date createTime;
    //课程
    private Integer curriculumId;
    //订单状态
    private Integer status;
    //优惠券
    private Integer couponId;
    //get set 方法
    public void setId (Integer  id){
        this.id=id;
    }
    public  Integer getId(){
        return this.id;
    }
    public void setOrderId (Integer  orderId){
        this.orderId=orderId;
    }
    public  Integer getOrderId(){
        return this.orderId;
    }
    public void setCreateTime (Date  createTime){
        this.createTime=createTime;
    }
    public  Date getCreateTime(){
        return this.createTime;
    }
    public void setCurriculumId (Integer  curriculumId){
        this.curriculumId=curriculumId;
    }
    public  Integer getCurriculumId(){
        return this.curriculumId;
    }
    public void setStatus (Integer  status){
        this.status=status;
    }
    public  Integer getStatus(){
        return this.status;
    }
    public void setCouponId (Integer  couponId){
        this.couponId=couponId;
    }
    public  Integer getCouponId(){
        return this.couponId;
    }
}
