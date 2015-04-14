package org.restangular.rest.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by oussama on 4/14/2015.
 */
@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class BadRequestException extends RuntimeException {

    public BadRequestException () {
    }

    public BadRequestException(Throwable cause) {
        super(cause);
    }
}
