package com.profileapi.application.usecase.impl;

import com.profileapi.adapter.out.persistence.repository.ProfileJpaRepository;
import com.profileapi.common.exception.code.ErrorCode;
import com.profileapi.common.exception.custom.ResourceNotFoundException;
import com.profileapi.domain.service.ProfileNameService;
import org.springframework.stereotype.Service;

@Service
public class ProfileNameServiceImpl implements ProfileNameService {
    private final ProfileJpaRepository profileJpaRepository;

    public ProfileNameServiceImpl(ProfileJpaRepository profileJpaRepository) {
        this.profileJpaRepository = profileJpaRepository;
    }

    @Override
    public String getName(Long id) {
        return profileJpaRepository
                .findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(ErrorCode.PROFILE_NAME_FOUND))
                .getName();
    }
}
