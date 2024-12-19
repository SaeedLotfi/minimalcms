package com.saeed.minimalcms.entity;

import com.saeed.minimalcms.enums.FieldType;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Field {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Enumerated(EnumType.STRING)
    private FieldType type;

    private String name;
    private boolean isPrivate;
    private boolean isUnique;

    @ManyToMany
    @JoinTable(
            name = "CONTENTTYPE_FIELD",
            joinColumns = @JoinColumn(name = "FIELD_ID"),
            inverseJoinColumns = @JoinColumn(name = "CONTENTTYPE_ID")
    )
    private List<ContentType> contentTypes;

    @ManyToMany
    @JoinTable(
            name = "COMPONENT_FIELD",
            joinColumns = @JoinColumn(name = "FIELD_ID"),
            inverseJoinColumns = @JoinColumn(name = "COMPONENT_ID"))
    private List<Component> components;
}
