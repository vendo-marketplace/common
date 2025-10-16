package com.vendo.domain.user.common.exception;

@Deprecated
public class UserAlreadyExistsException extends RuntimeException {
    public UserAlreadyExistsException(String message) {
        super(message);
    }
}
