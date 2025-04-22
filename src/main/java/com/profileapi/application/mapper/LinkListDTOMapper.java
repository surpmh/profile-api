package com.profileapi.application.mapper;

import com.profileapi.application.dto.LinkDTO;
import com.profileapi.application.dto.LinkListDTO;
import com.profileapi.common.mapper.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LinkListDTOMapper implements Mapper<List<LinkDTO>, LinkListDTO> {
    @Override
    public LinkListDTO map(List<LinkDTO> source) {
        return LinkListDTO.builder()
                .links(source)
                .build();
    }
}
