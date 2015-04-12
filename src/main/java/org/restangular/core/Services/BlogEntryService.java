package org.restangular.core.services;

import org.restangular.core.models.BlogEntry;
import org.restangular.core.services.base.CrudService;
import org.restangular.rest.resources.BlogEntryResource;

/**
 * Created by oussama on 4/11/2015.
 */
public interface BlogEntryService {

    BlogEntry findOne(Long id);

    BlogEntry create(BlogEntry blogEntry);

    BlogEntry update(BlogEntry blogEntry);

    void deleteById(Long id);
}
