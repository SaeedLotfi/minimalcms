package com.saeed.minimalcms.entity;

import com.saeed.minimalcms.enums.FieldType;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Field {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Enumerated(EnumType.STRING)
    private FieldType type = FieldType.TEXT;

    private String name;
    private boolean isPrivate;
    private boolean isUnique;

    @ManyToMany
    @JoinTable(
            name = "CONTENTTYPE_FIELD",
            joinColumns = @JoinColumn(name = "FIELD_ID"),
            inverseJoinColumns = @JoinColumn(name = "CONTENTTYPE_ID")
    )
    private List<ContentType> contentTypes = new ArrayList<>();

    @ManyToMany
    @JoinTable(
            name = "COMPONENT_FIELD",
            joinColumns = @JoinColumn(name = "FIELD_ID"),
            inverseJoinColumns = @JoinColumn(name = "COMPONENT_ID"))
    private List<Component> components = new ArrayList<>();

    protected Field() {}

    public Field(FieldType type, String name, boolean isPrivate, boolean isUnique) {
        this.type = type;
        this.name = name;
        this.isPrivate = isPrivate;
        this.isUnique = isUnique;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public FieldType getType() {
        return type;
    }

    public void setType(FieldType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPrivate() {
        return isPrivate;
    }

    public void setPrivate(boolean aPrivate) {
        isPrivate = aPrivate;
    }

    public boolean isUnique() {
        return isUnique;
    }

    public void setUnique(boolean unique) {
        isUnique = unique;
    }

    public List<ContentType> getContentTypes() {
        return contentTypes;
    }

    public void addContentType(ContentType contentType) {
        this.contentTypes.add(contentType);
    }

    public List<Component> getComponents() {
        return components;
    }

    public void addComponent(Component component) {
        this.components.add(component);
    }
}
