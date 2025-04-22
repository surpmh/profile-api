package com.profileapi.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
@AllArgsConstructor
public class Link {
    private Long linkId;
    private String icon;
    private String title;
    private String url;
    private boolean isActive;
    private Integer sortOrder;
    private LocalDateTime updatedAt;
    private LocalDateTime createAt;
    private LocalDateTime deletedAt;
}
