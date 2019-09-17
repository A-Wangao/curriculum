package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Second implements Serializable {
    //主键
    private Integer id;
    //章节id
    private Integer chapterId;
    //次课程名称
    private String secondName;
    //视频
    private String video;
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
    public void setChapterId (Integer  chapterId){
        this.chapterId=chapterId;
    }
    public  Integer getChapterId(){
        return this.chapterId;
    }
    public void setSecondName (String  secondName){
        this.secondName=secondName;
    }
    public  String getSecondName(){
        return this.secondName;
    }
    public void setVideo (String  video){
        this.video=video;
    }
    public  String getVideo(){
        return this.video;
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
