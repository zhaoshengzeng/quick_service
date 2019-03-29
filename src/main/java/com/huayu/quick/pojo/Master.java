package com.huayu.quick.pojo;

public class Master {
    private Integer mid;

    private String masname;

    private String maspassword;

    private String sex;

    private Integer masphone;

    private String masaddress;

    private String mastype;

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getMasname() {
        return masname;
    }

    public void setMasname(String masname) {
        this.masname = masname == null ? null : masname.trim();
    }

    public String getMaspassword() {
        return maspassword;
    }

    public void setMaspassword(String maspassword) {
        this.maspassword = maspassword == null ? null : maspassword.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Integer getMasphone() {
        return masphone;
    }

    public void setMasphone(Integer masphone) {
        this.masphone = masphone;
    }

    public String getMasaddress() {
        return masaddress;
    }

    public void setMasaddress(String masaddress) {
        this.masaddress = masaddress == null ? null : masaddress.trim();
    }

    public String getMastype() {
        return mastype;
    }

    public void setMastype(String mastype) {
        this.mastype = mastype == null ? null : mastype.trim();
    }
}