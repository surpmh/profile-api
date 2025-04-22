package com.profileapi.application.mapper;

import com.profileapi.application.dto.LinkDTO;
import com.profileapi.common.mapper.Mapper;
import com.profileapi.domain.model.Link;
import org.springframework.stereotype.Component;

@Component
public class LinkDTOMapper implements Mapper<Link, LinkDTO> {
    @Override
    public LinkDTO map(Link source) {
        return LinkDTO.builder()
                .icon(source.getIcon())
                .title(source.getTitle())
                .url(source.getUrl())
                .build();
    }
}
