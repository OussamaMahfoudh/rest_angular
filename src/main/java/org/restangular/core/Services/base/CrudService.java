package org.restangular.core.Services.base;

import org.restangular.core.models.BlogEntry;

/**
 * Created by oussama on 4/11/2015.
 */
public interface CrudService {

    public BlogEntry findOne(Long id);
}
