package com.profileapi.adapter.out.persistence.mapper;

import com.profileapi.adapter.out.persistence.entity.LinkEntity;
import com.profileapi.common.mapper.Mapper;
import com.profileapi.domain.model.Link;
import org.springframework.stereotype.Component;

@Component
public class LinkEntityMapper implements Mapper<LinkEntity, Link> {
    @Override
    public Link map(LinkEntity source) {
        return Link.builder()
                .linkId(source.getLinkId())
                .icon(source.getIcon())
                .title(source.getTitle())
                .url(source.getUrl())
                .isActive(source.isActive())
                .sortOrder(source.getSortOrder())
                .updatedAt(source.getUpdatedAt())
                .createAt(source.getCreateAt())
                .deletedAt(source.getDeletedAt())
                .build();
    }
}
