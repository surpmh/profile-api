package com.profileapi.adapter.in.web.controller;

import com.profileapi.adapter.in.web.mapper.LinkListResponseMapper;
import com.profileapi.adapter.in.web.response.BaseResponse;
import com.profileapi.adapter.in.web.response.LinkListResponse;
import com.profileapi.application.dto.LinkListDTO;
import com.profileapi.application.usecase.LinkUseCase;
import com.profileapi.common.validation.annotation.ProfileIdExists;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
@RequestMapping("/api/v1")
public class LinkController {
    private final LinkUseCase linkUseCase;
    private final LinkListResponseMapper linkListResponseMapper;

    public LinkController(LinkUseCase linkUseCase, LinkListResponseMapper linkListResponseMapper) {
        this.linkUseCase = linkUseCase;
        this.linkListResponseMapper = linkListResponseMapper;
    }

    @GetMapping("/links")
    public BaseResponse<LinkListResponse> links(@RequestParam @ProfileIdExists Long profileId) {
        LinkListDTO linksDTO = linkUseCase.GetLinks(profileId);
        LinkListResponse response = linkListResponseMapper.map(linksDTO);

        return BaseResponse.<LinkListResponse>builder()
                .success(true)
                .data(response)
                .build();
    }
}
