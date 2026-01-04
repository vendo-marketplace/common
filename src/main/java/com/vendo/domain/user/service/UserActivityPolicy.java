package com.vendo.domain.user.service;

import com.vendo.domain.user.common.type.UserStatus;
import com.vendo.security.common.exception.UserBlockedException;
import com.vendo.security.common.exception.UserEmailNotVerifiedException;
import com.vendo.security.common.exception.UserIsUnactiveException;

public final class UserActivityPolicy {

    public static void validateActivity(UserActivityView userActivityView) {
        if (userActivityView.getStatus() == null || userActivityView.getEmailVerified() == null) {
            throw new IllegalArgumentException("UserStatus or EmailVerified fields must not be null.");
        }

        if (userActivityView.getStatus() == UserStatus.BLOCKED) {
            throw new UserBlockedException("User is blocked.");
        }

        if (!userActivityView.getEmailVerified()) {
            throw new UserEmailNotVerifiedException("User email is not verified.");
        }

        if (userActivityView.getStatus() != UserStatus.ACTIVE) {
            throw new UserIsUnactiveException("User is unactive.");
        }
    }
}
