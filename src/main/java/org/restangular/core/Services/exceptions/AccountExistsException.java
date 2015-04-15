package org.restangular.core.services.exceptions;

/**
 * Created by oussama on 4/15/2015.
 */
public class AccountExistsException extends RuntimeException {
    public AccountExistsException() {
    }

    public AccountExistsException(Throwable cause) {
        super(cause);
    }

    public AccountExistsException(Throwable cause, String message) {
        super(message, cause);
    }

    public AccountExistsException(String message) {
        super(message);
    }
}
