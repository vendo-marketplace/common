package com.vendo.domain.user.common.dto;

import com.vendo.domain.user.common.type.UserStatus;
import com.vendo.domain.user.service.UserActivityView;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserActivityViewImpl implements UserActivityView {

    private UserStatus userStatus;

    private Boolean emailVerified;

    @Override
    public UserStatus getStatus() {
        return userStatus;
    }

    @Override
    public Boolean getEmailVerified() {
        return emailVerified;
    }

}
