package com.saeed.minimalcms.entity;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Component {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @ManyToMany(mappedBy = "components", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Field> fields = new ArrayList<>();

    @ManyToMany
    @JoinTable(
            name = "CONTENTTYPE_COMPONENT",
            joinColumns = @JoinColumn(name = "COMPONENT_ID"),
            inverseJoinColumns = @JoinColumn(name = "CONTENTTYPE_ID")
    )
    private List<ContentType> contentTypes = new ArrayList<>();

    protected Component() {}

    public Component(String name) {
        this.name = name;
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

    public List<Field> getFields() {
        return fields;
    }

    public void addField(Field field) {
        this.fields.add(field);
    }

    public List<ContentType> getContentTypes() {
        return contentTypes;
    }

    public void addContentType(ContentType contentType) {
        this.contentTypes.add(contentType);
    }
}
