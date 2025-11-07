package com.vendo.common.exception;

import lombok.Builder;

@Builder
public record ExceptionResponse(
        String message,
        String type,
        int code,
        String path) {
}
