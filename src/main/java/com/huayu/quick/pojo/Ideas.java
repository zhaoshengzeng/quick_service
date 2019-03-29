package com.huayu.quick.pojo;

public class Ideas {
    private String id;

    private String ioid;

    private String content;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getIoid() {
        return ioid;
    }

    public void setIoid(String ioid) {
        this.ioid = ioid == null ? null : ioid.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}