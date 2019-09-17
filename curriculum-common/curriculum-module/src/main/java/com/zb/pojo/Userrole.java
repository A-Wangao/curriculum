package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Userrole implements Serializable {
    //主键
    private Integer id;
    //角色id
    private Integer roleId;
    //get set 方法
    public void setId (Integer  id){
        this.id=id;
    }
    public  Integer getId(){
        return this.id;
    }
    public void setRoleId (Integer  roleId){
        this.roleId=roleId;
    }
    public  Integer getRoleId(){
        return this.roleId;
    }
}
