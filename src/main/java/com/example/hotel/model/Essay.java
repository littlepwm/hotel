package com.example.hotel.model;

import java.util.Date;

public class Essay {
    private Integer aid;

    private String uid;

    private String tiile;

    private Date createTime;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public String getTiile() {
        return tiile;
    }

    public void setTiile(String tiile) {
        this.tiile = tiile == null ? null : tiile.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}