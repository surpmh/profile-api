package com.profileapi.common.exception.custom;

import com.profileapi.common.exception.code.ErrorCode;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(ErrorCode errorCode) {
        super(errorCode.getErrorMessage());
    }
}