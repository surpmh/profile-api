package com.profileapi.adapter.in.web.mapper;

import com.profileapi.adapter.in.web.response.LinkResponse;
import com.profileapi.application.dto.LinkDTO;
import com.profileapi.common.mapper.Mapper;
import org.springframework.stereotype.Component;

@Component
public class LinkResponseMapper implements Mapper<LinkDTO, LinkResponse> {
    @Override
    public LinkResponse map(LinkDTO source) {
        return LinkResponse.builder()
                .icon(source.getIcon())
                .title(source.getTitle())
                .url(source.getUrl())
                .build();
    }
}
