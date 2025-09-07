package com.vendo.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Service {

    USER_SERVICE("user-service"),
    REGISTRY_SERVICE("registry-service");

    private final String name;

}
