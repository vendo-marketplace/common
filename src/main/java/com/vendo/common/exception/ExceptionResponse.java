package com.vendo.common.exception;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.time.Instant;
import java.util.Map;

@Data
@Builder
public class ExceptionResponse {

        @NonNull
        private String message;

        @JsonInclude(JsonInclude.Include.NON_NULL)
        private Map<String, String> errors;

        private int code;
        private String path;
        private final Instant timestamp = Instant.now();

}



