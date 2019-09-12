package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Goods implements Serializable {
    //主键
    private Long id;
    //订单编号
    private Long orderId;
    //订单时间
    private Date createtime;
    //课程
    private Long curriculumId;
    //订单状态（1:未支付2：已支付3：已过期）
    private Long status;
    //get set 方法
    public void setId (Long  id){
        this.id=id;
    }
    public  Long getId(){
        return this.id;
    }
    public void setOrderId (Long  orderId){
        this.orderId=orderId;
    }
    public  Long getOrderId(){
        return this.orderId;
    }
    public void setCreatetime (Date  createtime){
        this.createtime=createtime;
    }
    public  Date getCreatetime(){
        return this.createtime;
    }
    public void setCurriculumId (Long  curriculumId){
        this.curriculumId=curriculumId;
    }
    public  Long getCurriculumId(){
        return this.curriculumId;
    }
    public void setStatus (Long  status){
        this.status=status;
    }
    public  Long getStatus(){
        return this.status;
    }
}
