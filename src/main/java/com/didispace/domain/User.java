package com.didispace.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by xs on 2017-05-22.
 */
@Entity
public class User extends BaseEntity {
    @Id
    @GeneratedValue
    private Long  id;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
