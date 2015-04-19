package org.restangular.core.repositories;

import org.restangular.core.models.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by oussama on 4/18/2015.
 */
@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
}
