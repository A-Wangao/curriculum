package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Usercurriculum implements Serializable {
    //主键
    private Integer id;
    //用户Id
    private Integer userId;
    //用户学的哪个课程
    private String curriculum;
    //开始学习时间
    private Date startTime;
    //已学进度
    private String scheduled;
    //用时时间
    private Date userTime;
    //已学到课程
    private String learn;
    //笔记
    private String note;
    //代码
    private String code;
    //问答
    private String question;
    //数据状态
    private Integer status;
    //添加时间
    private Date createTime;
    //收藏
    private Integer collection;
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
    public void setCurriculum (String  curriculum){
        this.curriculum=curriculum;
    }
    public  String getCurriculum(){
        return this.curriculum;
    }
    public void setStartTime (Date  startTime){
        this.startTime=startTime;
    }
    public  Date getStartTime(){
        return this.startTime;
    }
    public void setScheduled (String  scheduled){
        this.scheduled=scheduled;
    }
    public  String getScheduled(){
        return this.scheduled;
    }
    public void setUserTime (Date  userTime){
        this.userTime=userTime;
    }
    public  Date getUserTime(){
        return this.userTime;
    }
    public void setLearn (String  learn){
        this.learn=learn;
    }
    public  String getLearn(){
        return this.learn;
    }
    public void setNote (String  note){
        this.note=note;
    }
    public  String getNote(){
        return this.note;
    }
    public void setCode (String  code){
        this.code=code;
    }
    public  String getCode(){
        return this.code;
    }
    public void setQuestion (String  question){
        this.question=question;
    }
    public  String getQuestion(){
        return this.question;
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
    public void setCollection (Integer  collection){
        this.collection=collection;
    }
    public  Integer getCollection(){
        return this.collection;
    }
}
