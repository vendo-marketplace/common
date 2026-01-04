package com.vendo.domain.user.service;

import com.vendo.domain.user.common.type.UserStatus;

public interface UserActivityView {

    UserStatus getStatus();

    Boolean isEmailVerified();

}
