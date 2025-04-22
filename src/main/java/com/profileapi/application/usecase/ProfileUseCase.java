package com.profileapi.application.usecase;

import com.profileapi.application.dto.ProfileDTO;


public interface ProfileUseCase {
    ProfileDTO GetProfile(Long id);
}
