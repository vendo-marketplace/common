package com.vendo.security.common.exception;

public class UserIsUnactiveException extends RuntimeException {
    public UserIsUnactiveException(String message) {
        super(message);
    }
}
