package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Classificationtype implements Serializable {
    //主键
    private Long id;
    //分类名称
    private String typeName;
    //分类所属方向
    private Long directionId;
    //get set 方法
    public void setId (Long  id){
        this.id=id;
    }
    public  Long getId(){
        return this.id;
    }
    public void setTypeName (String  typeName){
        this.typeName=typeName;
    }
    public  String getTypeName(){
        return this.typeName;
    }
    public void setDirectionId (Long  directionId){
        this.directionId=directionId;
    }
    public  Long getDirectionId(){
        return this.directionId;
    }
}
