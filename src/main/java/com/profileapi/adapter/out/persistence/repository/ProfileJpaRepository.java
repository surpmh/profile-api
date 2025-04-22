package com.profileapi.adapter.out.persistence.repository;

import com.profileapi.adapter.out.persistence.entity.ProfileEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileJpaRepository extends JpaRepository<ProfileEntity, Long> {
}
