package org.rest.core.models.base;

import java.util.Date;

/**
 * Created by oussama on 4/9/2015.
 */
public abstract class BaseModel {

    private Long id;
    private Date ts_insert;
    private Date ts_update;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getTs_insert() {
        return ts_insert;
    }

    public Date getTs_update() {
        return ts_update;
    }
}
