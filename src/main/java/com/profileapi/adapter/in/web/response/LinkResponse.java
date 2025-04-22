package com.profileapi.adapter.in.web.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class LinkResponse {
    private String icon;
    private String title;
    private String url;
}
