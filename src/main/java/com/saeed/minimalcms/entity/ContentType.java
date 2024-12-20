package com.saeed.minimalcms.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.ArrayList;
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
    private com.saeed.minimalcms.enums.ContentType type = com.saeed.minimalcms.enums.ContentType.COLLECTION;

    @OneToMany(mappedBy = "contentType", fetch = FetchType.LAZY)
    @JsonIgnoreProperties("contentType")
    private List<Content> contents = new ArrayList<>();

    @ManyToMany(
            mappedBy = "contentTypes",
            cascade = {CascadeType.PERSIST, CascadeType.MERGE},
            fetch = FetchType.LAZY)
    @JsonIgnoreProperties("contentTypes")
    private List<Field> fields = new ArrayList<>();

    @ManyToMany(
            mappedBy = "contentTypes",
            cascade = {CascadeType.PERSIST, CascadeType.MERGE},
            fetch = FetchType.LAZY)
    @JsonIgnoreProperties("contentTypes")
    private List<Component> components = new ArrayList<>();

    protected ContentType() {}

    public ContentType(String name, String apiName, String apiNamePlural,
                       com.saeed.minimalcms.enums.ContentType type) {
        this.name = name;
        this.apiName = apiName;
        this.apiNamePlural = apiNamePlural;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    public String getApiNamePlural() {
        return apiNamePlural;
    }

    public void setApiNamePlural(String apiNamePlural) {
        this.apiNamePlural = apiNamePlural;
    }

    public com.saeed.minimalcms.enums.ContentType getType() {
        return type;
    }

    public void setType(com.saeed.minimalcms.enums.ContentType type) {
        this.type = type;
    }

    public List<Content> getContents() {
        return contents;
    }

    public void addContent(Content content) {
        this.contents.add(content);
    }

    public List<Field> getFields() {
        return fields;
    }

    public void addField(Field field) {
        this.fields.add(field);
    }

    public List<Component> getComponents() {
        return components;
    }

    public void addComponent(Component component) {
        this.components.add(component);
    }
}
