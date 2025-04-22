package com.profileapi.domain.service;

import com.profileapi.domain.model.Link;

import java.util.List;

public interface LinkListService {
    List<Link> getLinkList(Long id);
}