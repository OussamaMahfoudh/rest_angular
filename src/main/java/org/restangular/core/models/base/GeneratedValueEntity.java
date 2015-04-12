package org.restangular.core.models.base;

import com.fasterxml.jackson.databind.deser.Deserializers;

/**
 * Created by oussama on 4/12/2015.
 */
public abstract class GeneratedValueEntity extends Deserializers.Base {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
