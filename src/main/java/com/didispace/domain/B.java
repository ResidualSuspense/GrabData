package com.didispace.domain;

import javax.persistence.*;
import java.util.List;

/**
 * Created by xs on 2017-05-23.
 */
@Entity(name = "b")
public class B {
    @Id
    @GeneratedValue
    private Long id;
    private String name;


    //@ManyToMany注释表示Teacher是多对多关系的一端。
    //@JoinTable描述了多对多关系的数据表关系。name属性指定中间表名称，joinColumns定义中间表与Teacher表的外键关系。
    //中间表Teacher_Student的Teacher_ID列是Teacher表的主键列对应的外键列，inverseJoinColumns属性定义了中间表与另外一端(Student)的外键关系。

    @ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    @JoinTable(name = "a_b",
            joinColumns = { @JoinColumn(name = "b_id", referencedColumnName = "id") },
            inverseJoinColumns = { @JoinColumn(name = "a_id", referencedColumnName = "id") })
    private List<A> as;

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

    public List<A> getAs() {
        return as;
    }

    public void setAs(List<A> as) {
        this.as = as;
    }
}
