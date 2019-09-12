package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Reply implements Serializable {
    //主键
    private Long id;
    //评论Id
    private Long commentId;
    //回复人
    private Long fromuserid;
    //回复对象
    private Long touserid;
    //回复内容
    private String replymsg;
    //创建时间
    private Date createtime;
    //get set 方法
    public void setId (Long  id){
        this.id=id;
    }
    public  Long getId(){
        return this.id;
    }
    public void setCommentId (Long  commentId){
        this.commentId=commentId;
    }
    public  Long getCommentId(){
        return this.commentId;
    }
    public void setFromuserid (Long  fromuserid){
        this.fromuserid=fromuserid;
    }
    public  Long getFromuserid(){
        return this.fromuserid;
    }
    public void setTouserid (Long  touserid){
        this.touserid=touserid;
    }
    public  Long getTouserid(){
        return this.touserid;
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
}
