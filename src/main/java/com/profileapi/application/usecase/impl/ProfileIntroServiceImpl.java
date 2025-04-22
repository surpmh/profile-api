package com.profileapi.application.usecase.impl;

import com.profileapi.adapter.out.persistence.repository.ProfileJpaRepository;
import com.profileapi.common.exception.code.ErrorCode;
import com.profileapi.common.exception.custom.ResourceNotFoundException;
import com.profileapi.domain.service.ProfileIntroService;
import org.springframework.stereotype.Service;

@Service
public class ProfileIntroServiceImpl implements ProfileIntroService {
    private final ProfileJpaRepository profileJpaRepository;

    public ProfileIntroServiceImpl(ProfileJpaRepository profileJpaRepository) {
        this.profileJpaRepository = profileJpaRepository;
    }

    @Override
    public String getIntro(Long id) {
        return profileJpaRepository
                .findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(ErrorCode.PROFILE_INTRO_FOUND))
                .getIntro();
    }
}
