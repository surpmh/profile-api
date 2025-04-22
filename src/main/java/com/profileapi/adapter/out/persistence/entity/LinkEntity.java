package com.profileapi.adapter.out.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "link")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LinkEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "link_id", columnDefinition = "bigint unsigned", nullable = false)
    private Long linkId;

    @Column(name = "profile_id", columnDefinition = "bigint unsigned", nullable = false)
    private Long profileId;

    @Column(name = "icon", columnDefinition = "varchar(100)", nullable = false)
    private String icon;

    @Column(name = "title", columnDefinition = "varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci", nullable = false)
    private String title;

    @Column(name = "url", columnDefinition = "varchar(100)", nullable = false)
    private String url;

    @Column(name = "active", columnDefinition = "boolean", nullable = false)
    private boolean active;

    @Column(name = "sort_order", columnDefinition = "int(10)", nullable = false)
    private Integer sortOrder;
}