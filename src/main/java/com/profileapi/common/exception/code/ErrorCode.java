package com.profileapi.common.exception.code;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum ErrorCode {
    PROFILE_ID_NOT_FOUND(HttpStatus.NOT_FOUND, "존재하지 않는 프로필 아이디입니다."),
    PROFILE_IMAGE_NOT_FOUND(HttpStatus.NOT_FOUND, "존재하지 않는 프로필 이미지입니다."),
    PROFILE_NAME_FOUND(HttpStatus.NOT_FOUND, "존재하지 않는 프로필 이름입니다."),
    PROFILE_INTRO_FOUND(HttpStatus.NOT_FOUND, "존재하지 않는 프로필 소개입니다.");

    private final HttpStatus errorCode;
    private final String errorMessage;

    ErrorCode(HttpStatus errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }
}
