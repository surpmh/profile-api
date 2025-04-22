package com.profileapi.adapter.out.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "profile")
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProfileEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "profile_id", columnDefinition = "bigint unsigned", nullable = false)
    private Long profile_id;

    @Column(name = "profile_image_url", columnDefinition = "varchar(100)", nullable = false)
    private String profileImageUrl;

    @Column(name = "name", columnDefinition = "varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci", nullable = false)
    private String name;

    @Column(name = "intro", columnDefinition = "varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci", nullable = false)
    private String intro;
}
