package com.didispace.domain;

import javax.persistence.*;
import java.util.List;

/**
 * Created by xs on 2017-05-23.
 */
@Entity(name = "a")
public class A {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @ManyToMany(mappedBy = "as")
    private List<B> bs;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<B> getBs() {
        return bs;
    }

    public void setBs(List<B> bs) {
        this.bs = bs;
    }
}
