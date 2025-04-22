package com.profileapi.adapter.out.persistence.repository;

import com.profileapi.adapter.out.persistence.entity.LinkEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LinkJpaRepository extends JpaRepository<LinkEntity, Long> {
    List<LinkEntity> findByProfileIdAndActiveTrueOrderBySortOrderAsc(Long profileId);
}
