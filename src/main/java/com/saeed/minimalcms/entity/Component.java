package com.saeed.minimalcms.entity;

import jakarta.persistence.*;

import javax.print.attribute.standard.Fidelity;
import java.util.List;

@Entity
public class Component {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @ManyToMany(mappedBy = "components")
    private List<Field> fields;

    @ManyToMany
    @JoinTable(
            name = "CONTENTTYPE_COMPONENT",
            joinColumns = @JoinColumn(name = "COMPONENT_ID"),
            inverseJoinColumns = @JoinColumn(name = "CONTENTTYPE_ID")
    )
    private List<ContentType> contentTypes;
}
