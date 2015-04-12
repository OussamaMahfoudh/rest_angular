package org.restangular.core.models.base;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by oussama on 4/9/2015.
 */
public abstract class BaseModel implements Serializable{

    private Date ts_insert;
    private Date ts_update;

    public Date getTs_insert() {
        return ts_insert;
    }

    public Date getTs_update() {
        return ts_update;
    }
}
