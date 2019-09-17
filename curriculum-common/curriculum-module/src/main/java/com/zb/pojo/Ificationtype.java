package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Ificationtype implements Serializable {
    //主键
    private Integer id;
    //分类名称
    private String typeName;
    //分类所属方向
    private Integer directionId;
    //get set 方法
    public void setId (Integer  id){
        this.id=id;
    }
    public  Integer getId(){
        return this.id;
    }
    public void setTypeName (String  typeName){
        this.typeName=typeName;
    }
    public  String getTypeName(){
        return this.typeName;
    }
    public void setDirectionId (Integer  directionId){
        this.directionId=directionId;
    }
    public  Integer getDirectionId(){
        return this.directionId;
    }
}
