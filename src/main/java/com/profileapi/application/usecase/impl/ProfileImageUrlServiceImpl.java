package com.profileapi.application.usecase.impl;

import com.profileapi.adapter.out.persistence.repository.ProfileJpaRepository;
import com.profileapi.common.exception.code.ErrorCode;
import com.profileapi.common.exception.custom.ResourceNotFoundException;
import com.profileapi.domain.service.ProfileImageUrlService;
import org.springframework.stereotype.Service;

@Service
public class ProfileImageUrlServiceImpl implements ProfileImageUrlService {
    private final ProfileJpaRepository profileJpaRepository;

    public ProfileImageUrlServiceImpl(ProfileJpaRepository profileJpaRepository) {
        this.profileJpaRepository = profileJpaRepository;
    }

    @Override
    public String getProfileImageUrl(Long id) {
        return profileJpaRepository
                .findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(ErrorCode.PROFILE_IMAGE_NOT_FOUND))
                .getProfileImageUrl();
    }
}
