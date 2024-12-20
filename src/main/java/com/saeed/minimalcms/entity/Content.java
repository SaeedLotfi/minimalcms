package com.saeed.minimalcms.entity;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.*;

import java.util.Map;

@Entity
public class Content {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "CONTENTTYPE_ID", nullable = false)
    private ContentType contentType;

    @Lob
    @Column(columnDefinition = "TEXT")
    private String value;

    public Map<String, Object> getValueAsMap() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(value, Map.class);
    }

    public void setValueFromMap(Map<String, Object> valueMap) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        value = mapper.writeValueAsString(valueMap);
    }

    protected Content() {}

    public Content(String value) {
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ContentType getContentType() {
        return contentType;
    }

    public void setContentType(ContentType contentType) {
        this.contentType = contentType;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
