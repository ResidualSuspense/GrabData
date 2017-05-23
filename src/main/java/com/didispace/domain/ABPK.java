package com.didispace.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by xs on 2017-05-23.
 */
@Embeddable
public class ABPK implements Serializable {
    @Column(name = "a_id")
    private Long aId;
    @Column(name = "b_id")
    private Long bId;

    public Long getaId() {
        return aId;
    }

    public void setaId(Long aId) {
        this.aId = aId;
    }

    public Long getbId() {
        return bId;
    }

    public void setbId(Long bId) {
        this.bId = bId;
    }
}
