package com.vendo.security.common.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TokenClaim {

    ROLES_CLAIM("roles"),
    STATUS_CLAIM("status");

    private final String claim;
}
