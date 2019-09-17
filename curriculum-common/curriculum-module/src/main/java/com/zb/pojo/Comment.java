package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Comment implements Serializable {
    //主键
    private Integer id;
    //笔记人
    private Integer issueId;
    //回复人
    private Integer userId;
    //评论内容
    private String replyMsg;
    //创建时间
    private Date createTime;
    //赞数
    private Integer zannumber;
    //次课程id
    private Integer secondId;
    //数据状态
    private Integer state;
    //get set 方法
    public void setId (Integer  id){
        this.id=id;
    }
    public  Integer getId(){
        return this.id;
    }
    public void setIssueId (Integer  issueId){
        this.issueId=issueId;
    }
    public  Integer getIssueId(){
        return this.issueId;
    }
    public void setUserId (Integer  userId){
        this.userId=userId;
    }
    public  Integer getUserId(){
        return this.userId;
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
    public void setZannumber (Integer  zannumber){
        this.zannumber=zannumber;
    }
    public  Integer getZannumber(){
        return this.zannumber;
    }
    public void setSecondId (Integer  secondId){
        this.secondId=secondId;
    }
    public  Integer getSecondId(){
        return this.secondId;
    }
    public void setState (Integer  state){
        this.state=state;
    }
    public  Integer getState(){
        return this.state;
    }
}
