package com.didispace.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Administrator on 2017-02-28.
 */
@Entity
public class InfoClass {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String title;
    private String keywords;
    private String description;
    private int seq;//排序 从0。。。。10开始

    public InfoClass() {
    }

    public InfoClass(int id, String name, String title, String keywords, String description, int seq) {
        this.id=id;
        this.name = name;
        this.title = title;
        this.keywords = keywords;
        this.description = description;
        this.seq = seq;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }
}
