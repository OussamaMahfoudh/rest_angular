package org.restangular.core.services.exceptions;

/**
 * Created by oussama on 4/15/2015.
 */
public class BlogNotFoundException extends RuntimeException {
    public BlogNotFoundException() {
    }

    public BlogNotFoundException(Throwable cause) {
        super(cause);
    }

    public BlogNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public BlogNotFoundException(String message) {
        super(message);
    }
}
