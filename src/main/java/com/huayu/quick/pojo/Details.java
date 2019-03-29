package com.huayu.quick.pojo;

public class Details {
    private Integer did;

    private String doid;

    private Float amount;

    private Float cover;

    private Float fined;

    private Float bonus;

    private String payment;

    private String paytime;

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDoid() {
        return doid;
    }

    public void setDoid(String doid) {
        this.doid = doid == null ? null : doid.trim();
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public Float getCover() {
        return cover;
    }

    public void setCover(Float cover) {
        this.cover = cover;
    }

    public Float getFined() {
        return fined;
    }

    public void setFined(Float fined) {
        this.fined = fined;
    }

    public Float getBonus() {
        return bonus;
    }

    public void setBonus(Float bonus) {
        this.bonus = bonus;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment == null ? null : payment.trim();
    }

    public String getPaytime() {
        return paytime;
    }

    public void setPaytime(String paytime) {
        this.paytime = paytime == null ? null : paytime.trim();
    }
}