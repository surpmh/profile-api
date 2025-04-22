package com.profileapi.adapter.in.web.controller;

import com.profileapi.adapter.in.web.mapper.ProfileResponseMapper;
import com.profileapi.adapter.in.web.response.BaseResponse;
import com.profileapi.adapter.in.web.response.ProfileResponse;
import com.profileapi.application.dto.ProfileDTO;
import com.profileapi.application.usecase.ProfileUseCase;
import com.profileapi.common.validation.annotation.ProfileIdExists;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
@RequestMapping("/api/v1")
public class ProfileController {
    private final ProfileUseCase profileUseCase;
    private final ProfileResponseMapper profileResponseMapper;

    public ProfileController(ProfileUseCase profileUseCase, ProfileResponseMapper profileResponseMapper) {
        this.profileUseCase = profileUseCase;
        this.profileResponseMapper = profileResponseMapper;
    }

    @GetMapping("/profile")
    public BaseResponse<ProfileResponse> profile(@RequestParam @ProfileIdExists Long profileId) {
        ProfileDTO profileDTO = profileUseCase.GetProfile(profileId);
        ProfileResponse response = profileResponseMapper.map(profileDTO);

        return BaseResponse.<ProfileResponse>builder()
                .success(true)
                .data(response)
                .build();
    }
}