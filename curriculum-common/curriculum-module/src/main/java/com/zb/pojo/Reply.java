package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Reply implements Serializable {
    //主键
    private Integer id;
    //评论Id
    private Integer commentId;
    //回复人
    private Integer fromuserId;
    //回复对象
    private Integer touserId;
    //回复内容
    private String replyMsg;
    //创建时间
    private Date createTime;
    //数据状态
    private Integer status;
    //get set 方法
    public void setId (Integer  id){
        this.id=id;
    }
    public  Integer getId(){
        return this.id;
    }
    public void setCommentId (Integer  commentId){
        this.commentId=commentId;
    }
    public  Integer getCommentId(){
        return this.commentId;
    }
    public void setFromuserId (Integer  fromuserId){
        this.fromuserId=fromuserId;
    }
    public  Integer getFromuserId(){
        return this.fromuserId;
    }
    public void setTouserId (Integer  touserId){
        this.touserId=touserId;
    }
    public  Integer getTouserId(){
        return this.touserId;
    }
    public void setReplyMsg (String  replyMsg){
        this.replyMsg=replyMsg;
    }
    public  String getReplyMsg(){
        return this.replyMsg;
    }
    public void setCreateTime (Date  createTime){
        this.createTime=createTime;
    }
    public  Date getCreateTime(){
        return this.createTime;
    }
    public void setStatus (Integer  status){
        this.status=status;
    }
    public  Integer getStatus(){
        return this.status;
    }
}
