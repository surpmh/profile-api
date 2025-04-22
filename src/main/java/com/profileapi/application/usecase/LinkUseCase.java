package com.profileapi.application.usecase;

import com.profileapi.application.dto.LinkListDTO;
import org.springframework.stereotype.Service;

@Service
public interface LinkUseCase {
    LinkListDTO GetLinks(Long id);
}