package org.restangular.core.services;

import org.restangular.core.models.BlogEntry;

/**
 * Created by oussama on 4/11/2015.
 */
public interface BlogEntryService {

    BlogEntry findOne(Long id);

    BlogEntry create(BlogEntry blogEntry);

    BlogEntry update(BlogEntry blogEntry);

    void deleteById(Long id);
}
