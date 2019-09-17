package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Directiontype implements Serializable {
    //主键
    private Integer id;
    //方向名称
    private String directionName;
    //get set 方法
    public void setId (Integer  id){
        this.id=id;
    }
    public  Integer getId(){
        return this.id;
    }
    public void setDirectionName (String  directionName){
        this.directionName=directionName;
    }
    public  String getDirectionName(){
        return this.directionName;
    }
}
