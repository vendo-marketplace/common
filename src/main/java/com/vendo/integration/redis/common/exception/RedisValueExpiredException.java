package com.vendo.integration.redis.common.exception;

public class RedisValueExpiredException extends RuntimeException {
    public RedisValueExpiredException(String message) {
        super(message);
    }
}
