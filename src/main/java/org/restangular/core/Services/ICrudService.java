package org.restangular.core.services;

import org.restangular.core.models.base.BaseModel;

import java.util.List;

/**
 * Created by oussama on 4/18/2015.
 */
public interface ICrudService <T extends BaseModel> {

    T findOne(Long id);
    T save(T modelToSave);
    void delete(Long id);
    List<T> findAll();
}
