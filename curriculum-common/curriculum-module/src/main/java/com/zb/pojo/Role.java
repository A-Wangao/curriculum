package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Role implements Serializable {
    //主键
    private Integer id;
    //角色名
    private String roleName;
    //是否是默认角色
    private Integer defaultFlag;
    //是否删除
    private Integer deleteFlag;
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
    public void setRoleName (String  roleName){
        this.roleName=roleName;
    }
    public  String getRoleName(){
        return this.roleName;
    }
    public void setDefaultFlag (Integer  defaultFlag){
        this.defaultFlag=defaultFlag;
    }
    public  Integer getDefaultFlag(){
        return this.defaultFlag;
    }
    public void setDeleteFlag (Integer  deleteFlag){
        this.deleteFlag=deleteFlag;
    }
    public  Integer getDeleteFlag(){
        return this.deleteFlag;
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
