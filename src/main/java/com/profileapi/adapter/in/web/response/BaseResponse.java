package com.profileapi.adapter.in.web.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BaseResponse<T> {

    private boolean success;
    private int code;
    private String message;
    private T data;

    public BaseResponse(T data) {
        this.success = true;
        this.data = data;
    }

    public BaseResponse(int code, String message) {
        this.success = false;
        this.code = code;
        this.message = message;
    }
}