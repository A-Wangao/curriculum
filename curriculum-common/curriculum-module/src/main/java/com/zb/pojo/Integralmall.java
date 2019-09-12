package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Integralmall implements Serializable {
    //
    private Long id;
    //
    private String name;
    //
    private Double money;
    //
    private String integral;
    //
    private Date term;
    //
    private String images;
    //get set 方法
    public void setId (Long  id){
        this.id=id;
    }
    public  Long getId(){
        return this.id;
    }
    public void setName (String  name){
        this.name=name;
    }
    public  String getName(){
        return this.name;
    }
    public void setMoney (Double  money){
        this.money=money;
    }
    public  Double getMoney(){
        return this.money;
    }
    public void setIntegral (String  integral){
        this.integral=integral;
    }
    public  String getIntegral(){
        return this.integral;
    }
    public void setTerm (Date  term){
        this.term=term;
    }
    public  Date getTerm(){
        return this.term;
    }
    public void setImages (String  images){
        this.images=images;
    }
    public  String getImages(){
        return this.images;
    }
}
