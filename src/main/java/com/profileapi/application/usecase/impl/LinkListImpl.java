package com.profileapi.application.usecase.impl;

import com.profileapi.adapter.out.persistence.mapper.LinkEntityMapper;
import com.profileapi.adapter.out.persistence.repository.LinkJpaRepository;
import com.profileapi.domain.model.Link;
import com.profileapi.domain.service.LinkListService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LinkListImpl implements LinkListService {
    private final LinkJpaRepository linkJpaRepository;
    private final LinkEntityMapper linkEntityMapper;

    public LinkListImpl(LinkJpaRepository linkJpaRepository, LinkEntityMapper linkEntityMapper) {
        this.linkJpaRepository = linkJpaRepository;
        this.linkEntityMapper = linkEntityMapper;
    }

    @Override
    public List<Link> getLinkList(Long id) {
        return linkJpaRepository.findByProfileIdAndActiveTrueOrderBySortOrderAsc(id)
                .stream()
                .map(linkEntityMapper::map)
                .collect(Collectors.toList());
    }
}
