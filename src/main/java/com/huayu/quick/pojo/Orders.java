package com.huayu.quick.pojo;

import java.util.Date;

public class Orders {
    private String oid;

    private Integer uid;

    private String reqaddress;

    private Integer carid;

    private Integer serid;

    private Integer omid;

    private Date otime;

    private Date ojtime;

    private Date finishtime;

    private String ordertype;

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid == null ? null : oid.trim();
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getReqaddress() {
        return reqaddress;
    }

    public void setReqaddress(String reqaddress) {
        this.reqaddress = reqaddress == null ? null : reqaddress.trim();
    }

    public Integer getCarid() {
        return carid;
    }

    public void setCarid(Integer carid) {
        this.carid = carid;
    }

    public Integer getSerid() {
        return serid;
    }

    public void setSerid(Integer serid) {
        this.serid = serid;
    }

    public Integer getOmid() {
        return omid;
    }

    public void setOmid(Integer omid) {
        this.omid = omid;
    }

    public Date getOtime() {
        return otime;
    }

    public void setOtime(Date otime) {
        this.otime = otime;
    }

    public Date getOjtime() {
        return ojtime;
    }

    public void setOjtime(Date ojtime) {
        this.ojtime = ojtime;
    }

    public Date getFinishtime() {
        return finishtime;
    }

    public void setFinishtime(Date finishtime) {
        this.finishtime = finishtime;
    }

    public String getOrdertype() {
        return ordertype;
    }

    public void setOrdertype(String ordertype) {
        this.ordertype = ordertype == null ? null : ordertype.trim();
    }
}