package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Chapter implements Serializable {
    //主键
    private Integer id;
    //主课id
    private Integer curriculumId;
    //章节名称
    private String chapterName;
    //章节介绍
    private String introduce;
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
    public void setCurriculumId (Integer  curriculumId){
        this.curriculumId=curriculumId;
    }
    public  Integer getCurriculumId(){
        return this.curriculumId;
    }
    public void setChapterName (String  chapterName){
        this.chapterName=chapterName;
    }
    public  String getChapterName(){
        return this.chapterName;
    }
    public void setIntroduce (String  introduce){
        this.introduce=introduce;
    }
    public  String getIntroduce(){
        return this.introduce;
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
