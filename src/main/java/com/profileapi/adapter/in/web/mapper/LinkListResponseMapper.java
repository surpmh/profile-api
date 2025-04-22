package com.profileapi.adapter.in.web.mapper;

import com.profileapi.adapter.in.web.response.LinkListResponse;
import com.profileapi.adapter.in.web.response.LinkResponse;
import com.profileapi.application.dto.LinkListDTO;
import com.profileapi.common.mapper.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LinkListResponseMapper implements Mapper<LinkListDTO, LinkListResponse> {
    private final LinkResponseMapper linkResponseMapper;

    public LinkListResponseMapper(LinkResponseMapper linkResponseMapper) {
        this.linkResponseMapper = linkResponseMapper;
    }

    @Override
    public LinkListResponse map(LinkListDTO source) {
        List<LinkResponse> links = source.getLinks().stream().map(linkResponseMapper::map).toList();

        return LinkListResponse.builder()
                .links(links)
                .build();
    }
}
