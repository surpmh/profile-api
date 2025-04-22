package com.profileapi.domain.model;

import lombok.AllArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
public class Profile {
    private final String profileImageUrl;
    private final String name;
    private final String intro;
    private LocalDateTime updatedAt;
    private LocalDateTime createAt;
    private LocalDateTime deletedAt;
}