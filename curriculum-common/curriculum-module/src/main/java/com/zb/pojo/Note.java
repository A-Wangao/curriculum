package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Note implements Serializable {
    //主键
    private Integer id;
    //用户id
    private Integer userId;
    //主课程id
    private Integer mainId;
    //次课程id
    private Integer secondId;
    //笔记内容
    private String noteContent;
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
    public void setMainId (Integer  mainId){
        this.mainId=mainId;
    }
    public  Integer getMainId(){
        return this.mainId;
    }
    public void setSecondId (Integer  secondId){
        this.secondId=secondId;
    }
    public  Integer getSecondId(){
        return this.secondId;
    }
    public void setNoteContent (String  noteContent){
        this.noteContent=noteContent;
    }
    public  String getNoteContent(){
        return this.noteContent;
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
