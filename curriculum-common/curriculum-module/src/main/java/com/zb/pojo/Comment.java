package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Comment implements Serializable {
    //主键
    private Long id;
    //笔记人
    private Long issueId;
    //回复人
    private Long userId;
    //评论内容
    private String replymsg;
    //创建时间
    private Date createtime;
    //赞数
    private Integer zannumber;
    //get set 方法
    public void setId (Long  id){
        this.id=id;
    }
    public  Long getId(){
        return this.id;
    }
    public void setIssueId (Long  issueId){
        this.issueId=issueId;
    }
    public  Long getIssueId(){
        return this.issueId;
    }
    public void setUserId (Long  userId){
        this.userId=userId;
    }
    public  Long getUserId(){
        return this.userId;
    }
    public void setReplymsg (String  replymsg){
        this.replymsg=replymsg;
    }
    public  String getReplymsg(){
        return this.replymsg;
    }
    public void setCreatetime (Date  createtime){
        this.createtime=createtime;
    }
    public  Date getCreatetime(){
        return this.createtime;
    }
    public void setZannumber (Integer  zannumber){
        this.zannumber=zannumber;
    }
    public  Integer getZannumber(){
        return this.zannumber;
    }
}
