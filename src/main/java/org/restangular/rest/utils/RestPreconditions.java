package org.restangular.rest.utils;

import org.restangular.rest.exceptions.ResourceNotFoundException;

/**
 * Created by oussama on 4/12/2015.
 */
public class RestPreconditions {
    public static <T> T checkFound(final T resource) {
        if (resource == null) {
            throw new ResourceNotFoundException();
        }
        return resource;
    }
}
