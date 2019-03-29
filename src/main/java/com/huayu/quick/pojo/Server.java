package com.huayu.quick.pojo;

public class Server {
    private Integer id;

    private String sername;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSername() {
        return sername;
    }

    public void setSername(String sername) {
        this.sername = sername == null ? null : sername.trim();
    }
}