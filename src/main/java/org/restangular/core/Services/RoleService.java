package org.restangular.core.services;

import org.restangular.core.models.Role;
import org.restangular.core.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by oussama on 4/18/2015.
 */
@Service
public class RoleService implements ICrudService<Role> {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Role findOne(Long id) {
        return roleRepository.findOne(id);
    }

    @Override
    public Role save(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public void delete(Long id) {
        roleRepository.delete(id);
    }

    @Override
    public List<Role> findAll() {
        return (List<Role>) roleRepository.findAll();
    }
}
