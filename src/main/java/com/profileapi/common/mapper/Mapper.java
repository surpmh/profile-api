package com.profileapi.common.mapper;

public interface Mapper<S, T> {
    T map(S source);
}
