package com.vendo.common.exception;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.NonNull;

import java.util.Map;

@Builder
public record ExceptionResponse(
        @NonNull
        String message,

        @JsonInclude(JsonInclude.Include.NON_NULL)
        Map<String, String> errors,

        int code,
        String path) {
}



