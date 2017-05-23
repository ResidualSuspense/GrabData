package com.didispace.domain;

import javax.persistence.*;
import java.util.List;

/**
 * Created by xs on 2017-05-22.
 */
@Entity
public class Device  {
    @Id
    @GeneratedValue
    private Long  id;

    private String name;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<Partner> partners;
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

    public List<Partner> getPartners() {
        return partners;
    }

    public void setPartners(List<Partner> partners) {
        this.partners = partners;
    }
}
