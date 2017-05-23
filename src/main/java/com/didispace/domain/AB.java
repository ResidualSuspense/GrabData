package com.didispace.domain;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by xs on 2017-05-23.
 */
@Entity(name = "a_b")
public class AB {
    @EmbeddedId
    private ABPK abpk;

    private int age;

    public ABPK getAbpk() {
        return abpk;
    }

    public void setAbpk(ABPK abpk) {
        this.abpk = abpk;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

