package com.zb.vo;

public class UserTokenVo {
    private String token;
    private String expTime;
    private String genTime;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getExpTime() {
        return expTime;
    }

    public void setExpTime(String expTime) {
        this.expTime = expTime;
    }

    public String getGenTime() {
        return genTime;
    }

    public void setGenTime(String genTime) {
        this.genTime = genTime;
    }
}
