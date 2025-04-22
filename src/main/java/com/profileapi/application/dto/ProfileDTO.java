package com.profileapi.application.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class ProfileDTO {
    private String name;
    private String imageUrl;
    private String intro;

    public static ProfileDTO of(String imageUrl, String name, String intro) {
        return ProfileDTO.builder()
                .imageUrl(imageUrl)
                .name(name)
                .intro(intro)
                .build();
    }
}