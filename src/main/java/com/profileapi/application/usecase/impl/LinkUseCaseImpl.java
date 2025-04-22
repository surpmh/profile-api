package com.profileapi.application.usecase.impl;

import com.profileapi.application.dto.LinkDTO;
import com.profileapi.application.dto.LinkListDTO;
import com.profileapi.application.mapper.LinkDTOMapper;
import com.profileapi.application.mapper.LinkListDTOMapper;
import com.profileapi.application.usecase.LinkUseCase;
import com.profileapi.domain.service.LinkListService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LinkUseCaseImpl implements LinkUseCase {
    private final LinkListService linkListService;
    private final LinkDTOMapper linkDTOMapper;
    private final LinkListDTOMapper linkListDTOMapper;

    public LinkUseCaseImpl(LinkListService linkListService, LinkDTOMapper linkDTOMapper, LinkListDTOMapper linkListDTOMapper) {
        this.linkListService = linkListService;
        this.linkDTOMapper = linkDTOMapper;
        this.linkListDTOMapper = linkListDTOMapper;
    }

    @Override
    @Transactional(readOnly = true)
    public LinkListDTO GetLinks(Long id) {
        List<LinkDTO> links = linkListService.getLinkList(id)
                .stream()
                .map(linkDTOMapper::map)
                .collect(Collectors.toList());

        return linkListDTOMapper.map(links);
    }
}