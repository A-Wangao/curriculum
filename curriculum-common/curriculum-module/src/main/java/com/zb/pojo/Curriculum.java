package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Curriculum implements Serializable {
    //主键
    private Integer id;
    //课程名称
    private String courseName;
    //课程类型
    private Integer courseTypes;
    //难度等级(1:入门2：初级3：中级4：高级)
    private Integer hierarchicalType;
    //课程介绍
    private String courseintroduction;
    //课程章节
    private Integer coursechapters;
    //时长
    private String duration;
    //学习人数
    private Integer stuNumber;
    //课程须知
    private String courseNotes;
    //能学到什么
    private String whattolearn;
    //价格(0:为免费1：支付)
    private Double money;
    //课程图片
    private String image;
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
    public void setCourseintroduction (String  courseintroduction){
        this.courseintroduction=courseintroduction;
    }
    public  String getCourseintroduction(){
        return this.courseintroduction;
    }
    public void setCoursechapters (Integer  coursechapters){
        this.coursechapters=coursechapters;
    }
    public  Integer getCoursechapters(){
        return this.coursechapters;
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
    public void setWhattolearn (String  whattolearn){
        this.whattolearn=whattolearn;
    }
    public  String getWhattolearn(){
        return this.whattolearn;
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
}
