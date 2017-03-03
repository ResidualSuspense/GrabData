package com.didispace.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by Administrator on 2017-03-01.
 */
@Entity
public class Info {
    @Id
    @GeneratedValue
    private Long id;        //ID编码
    private String title;//资讯标题
    private int infoclass;//分类
    private String img;//图片
    private String description;//描述
    private String keywords;//关键字
    private int count;//访问次数
    private int fcount;//收藏数
    private int rcount;//评论读数
    private Timestamp time;

    public Info() {
    }

    public Info(Long id, String title, int infoclass, String img, String description, String keywords, int count, int fcount, int rcount, Timestamp time) {
        this.id=id;
        this.title = title;
        this.infoclass = infoclass;
        this.img = img;
        this.description = description;
        this.keywords = keywords;
        this.count = count;
        this.fcount = fcount;
        this.rcount = rcount;
        this.time = time;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getInfoclass() {
        return infoclass;
    }

    public void setInfoclass(int infoclass) {
        this.infoclass = infoclass;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getFcount() {
        return fcount;
    }

    public void setFcount(int fcount) {
        this.fcount = fcount;
    }

    public int getRcount() {
        return rcount;
    }

    public void setRcount(int rcount) {
        this.rcount = rcount;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }
}
