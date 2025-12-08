package com.vendo.security.common.exception;

public class UserEmailNotVerifiedException extends RuntimeException {
    public UserEmailNotVerifiedException(String message) {
        super(message);
    }
}
