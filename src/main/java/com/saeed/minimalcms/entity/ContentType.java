package com.saeed.minimalcms.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class ContentType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true)
    private String name;

    private String apiName;
    private String apiNamePlural;

    @Enumerated(EnumType.STRING)
    private com.saeed.minimalcms.enums.ContentType type;

    @OneToMany(mappedBy = "contentType")
    private List<Content> contents;
}
