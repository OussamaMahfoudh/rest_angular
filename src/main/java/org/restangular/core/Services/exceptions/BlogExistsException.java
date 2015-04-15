package org.restangular.core.services.exceptions;

/**
 * Created by oussama on 4/15/2015.
 */
public class BlogExistsException extends RuntimeException {
    public BlogExistsException() {
    }

    public BlogExistsException(Throwable cause) {
        super(cause);
    }

    public BlogExistsException(String message, Throwable cause) {
        super(message, cause);
    }

    public BlogExistsException(String message) {
        super(message);
    }
}
