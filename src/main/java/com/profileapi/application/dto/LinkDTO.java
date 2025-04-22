package com.profileapi.application.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class LinkDTO {
    private String icon;
    private String title;
    private String url;
}
