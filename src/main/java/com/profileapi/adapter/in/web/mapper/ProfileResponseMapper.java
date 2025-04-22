package com.profileapi.adapter.in.web.mapper;

import com.profileapi.adapter.in.web.response.ProfileResponse;
import com.profileapi.application.dto.ProfileDTO;
import com.profileapi.common.mapper.Mapper;
import org.springframework.stereotype.Component;

@Component
public class ProfileResponseMapper implements Mapper<ProfileDTO, ProfileResponse> {
    @Override
    public ProfileResponse map(ProfileDTO source) {
        return ProfileResponse.builder()
                .profileImageUrl(source.getImageUrl())
                .name(source.getName())
                .intro(source.getIntro())
                .build();
    }
}
