package com.profileapi.application.usecase.impl;

import com.profileapi.application.dto.ProfileDTO;
import com.profileapi.application.usecase.ProfileUseCase;
import com.profileapi.domain.service.ProfileImageUrlService;
import com.profileapi.domain.service.ProfileIntroService;
import com.profileapi.domain.service.ProfileNameService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProfileUseCaseImpl implements ProfileUseCase {
    private final ProfileImageUrlService profileImageUrlService;
    private final ProfileNameService profileNameService;
    private final ProfileIntroService profileIntroService;

    public ProfileUseCaseImpl(ProfileImageUrlService profileImageUrlService, ProfileNameService profileNameService, ProfileIntroService profileIntroService) {
        this.profileImageUrlService = profileImageUrlService;
        this.profileNameService = profileNameService;
        this.profileIntroService = profileIntroService;
    }

    @Override
    @Transactional(readOnly = true)
    public ProfileDTO GetProfile(Long id) {
        String imageUrl = profileImageUrlService.getProfileImageUrl(id);
        String name = profileNameService.getName(id);
        String intro = profileIntroService.getIntro(id);

        return ProfileDTO.of(imageUrl, name, intro);
    }
}