package com.didispace.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Administrator on 2017-03-03.
 */
@Entity
public class NewsInfo {
    @Id
    @GeneratedValue
    private Long id;
    private int count;
    private String description;
    private int fcount;
    private String img;
    private int infoclass;
    private String keywords;
    private String message;
    private int rcount;
    private long time;
    private String title;

    public NewsInfo() {
    }

    public NewsInfo(Long id,int count, String description, int fcount, String img, int infoclass, String keywords, String message, int rcount, long time, String title) {
        this.id=id;
        this.count = count;
        this.description = description;
        this.fcount = fcount;
        this.img = img;
        this.infoclass = infoclass;
        this.keywords = keywords;
        this.message = message;
        this.rcount = rcount;
        this.time = time;
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getFcount() {
        return fcount;
    }

    public void setFcount(int fcount) {
        this.fcount = fcount;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getInfoclass() {
        return infoclass;
    }

    public void setInfoclass(int infoclass) {
        this.infoclass = infoclass;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getRcount() {
        return rcount;
    }

    public void setRcount(int rcount) {
        this.rcount = rcount;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
