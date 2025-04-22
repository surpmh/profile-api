package com.profileapi.adapter.out.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity {

    @Column(name = "updated_at", columnDefinition = "datetime(3)")
    @LastModifiedDate
    private LocalDateTime updatedAt;

    @Column(name = "created_at", columnDefinition = "datetime(3)", updatable = false)
    @CreatedDate
    private LocalDateTime createAt;

    private LocalDateTime deletedAt;
}
