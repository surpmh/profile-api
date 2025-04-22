package com.profileapi.common.exception.custom;

import com.profileapi.common.exception.code.ErrorCode;

public class BadRequestException extends RuntimeException {
    public BadRequestException(ErrorCode errorCode) {
        super(errorCode.getErrorMessage());
    }
}
