package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Users implements Serializable {
    //主键
    private Long id;
    //手机号
    private String phone;
    //登录名
    private String username;
    //密码
    private String password;
    //昵称
    private String nickname;
    //头像
    private String headerimage;
    //添加时间
    private Date createtime;
    //职位
    private String position;
    //城市
    private String city;
    //性别
    private Integer sex;
    //介绍
    private String introduce;
    //总学习时长
    private String sumstudytime;
    //关注Id
    private Integer follow;
    //身份证
    private String peopleId;
    //真实姓名
    private String realName;
    //get set 方法
    public void setId (Long  id){
        this.id=id;
    }
    public  Long getId(){
        return this.id;
    }
    public void setPhone (String  phone){
        this.phone=phone;
    }
    public  String getPhone(){
        return this.phone;
    }
    public void setUsername (String  username){
        this.username=username;
    }
    public  String getUsername(){
        return this.username;
    }
    public void setPassword (String  password){
        this.password=password;
    }
    public  String getPassword(){
        return this.password;
    }
    public void setNickname (String  nickname){
        this.nickname=nickname;
    }
    public  String getNickname(){
        return this.nickname;
    }
    public void setHeaderimage (String  headerimage){
        this.headerimage=headerimage;
    }
    public  String getHeaderimage(){
        return this.headerimage;
    }
    public void setCreatetime (Date  createtime){
        this.createtime=createtime;
    }
    public  Date getCreatetime(){
        return this.createtime;
    }
    public void setPosition (String  position){
        this.position=position;
    }
    public  String getPosition(){
        return this.position;
    }
    public void setCity (String  city){
        this.city=city;
    }
    public  String getCity(){
        return this.city;
    }
    public void setSex (Integer  sex){
        this.sex=sex;
    }
    public  Integer getSex(){
        return this.sex;
    }
    public void setIntroduce (String  introduce){
        this.introduce=introduce;
    }
    public  String getIntroduce(){
        return this.introduce;
    }
    public void setSumstudytime (String  sumstudytime){
        this.sumstudytime=sumstudytime;
    }
    public  String getSumstudytime(){
        return this.sumstudytime;
    }
    public void setFollow (Integer  follow){
        this.follow=follow;
    }
    public  Integer getFollow(){
        return this.follow;
    }
    public void setPeopleId (String  peopleId){
        this.peopleId=peopleId;
    }
    public  String getPeopleId(){
        return this.peopleId;
    }
    public void setRealName (String  realName){
        this.realName=realName;
    }
    public  String getRealName(){
        return this.realName;
    }
}
