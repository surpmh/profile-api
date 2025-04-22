package com.profileapi.common.exception.custom;

import com.profileapi.common.exception.code.ErrorCode;

public class MethodArgumentNotValidException extends RuntimeException {
    public MethodArgumentNotValidException(ErrorCode errorCode) {
        super(errorCode.getErrorMessage());
    }
}
