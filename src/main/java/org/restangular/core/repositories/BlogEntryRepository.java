package org.restangular.core.repositories;

import org.restangular.core.models.BlogEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by oussama on 4/18/2015.
 */
@Repository
public interface BlogEntryRepository extends JpaRepository<BlogEntry, Long> {
}
