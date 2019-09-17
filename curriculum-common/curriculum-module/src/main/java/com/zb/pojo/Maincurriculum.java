package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Maincurriculum implements Serializable {
    //主键
    private Integer id;
    //课程名称
    private String courseName;
    //课程类型
    private Integer courseTypes;
    //难度等级
    private Integer hierarchicalType;
    //课程介绍
    private String introduction;
    //课程章节
    private Integer chapters;
    //时长
    private String duration;
    //学习人数
    private Integer stuNumber;
    //课程须知
    private String courseNotes;
    //能学到什么
    private String whattoLearn;
    //价格
    private Double money;
    //课程图片
    private String image;
    //教师id
    private Integer teacherId;
    //添加时间
    private Date createTime;
    //get set 方法
    public void setId (Integer  id){
        this.id=id;
    }
    public  Integer getId(){
        return this.id;
    }
    public void setCourseName (String  courseName){
        this.courseName=courseName;
    }
    public  String getCourseName(){
        return this.courseName;
    }
    public void setCourseTypes (Integer  courseTypes){
        this.courseTypes=courseTypes;
    }
    public  Integer getCourseTypes(){
        return this.courseTypes;
    }
    public void setHierarchicalType (Integer  hierarchicalType){
        this.hierarchicalType=hierarchicalType;
    }
    public  Integer getHierarchicalType(){
        return this.hierarchicalType;
    }
    public void setIntroduction (String  introduction){
        this.introduction=introduction;
    }
    public  String getIntroduction(){
        return this.introduction;
    }
    public void setChapters (Integer  chapters){
        this.chapters=chapters;
    }
    public  Integer getChapters(){
        return this.chapters;
    }
    public void setDuration (String  duration){
        this.duration=duration;
    }
    public  String getDuration(){
        return this.duration;
    }
    public void setStuNumber (Integer  stuNumber){
        this.stuNumber=stuNumber;
    }
    public  Integer getStuNumber(){
        return this.stuNumber;
    }
    public void setCourseNotes (String  courseNotes){
        this.courseNotes=courseNotes;
    }
    public  String getCourseNotes(){
        return this.courseNotes;
    }
    public void setWhattoLearn (String  whattoLearn){
        this.whattoLearn=whattoLearn;
    }
    public  String getWhattoLearn(){
        return this.whattoLearn;
    }
    public void setMoney (Double  money){
        this.money=money;
    }
    public  Double getMoney(){
        return this.money;
    }
    public void setImage (String  image){
        this.image=image;
    }
    public  String getImage(){
        return this.image;
    }
    public void setTeacherId (Integer  teacherId){
        this.teacherId=teacherId;
    }
    public  Integer getTeacherId(){
        return this.teacherId;
    }
    public void setCreateTime (Date  createTime){
        this.createTime=createTime;
    }
    public  Date getCreateTime(){
        return this.createTime;
    }
}
