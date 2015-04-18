package org.restangular.core.models.base;

import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by oussama on 4/9/2015.
 */

@MappedSuperclass
public abstract class BaseModel implements Serializable {

    @Temporal(value = TemporalType.TIMESTAMP)
    private Date ts_insert;
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date ts_update;

    public Date getTs_insert() {
        return ts_insert;
    }

    public Date getTs_update() {
        return ts_update;
    }
}
