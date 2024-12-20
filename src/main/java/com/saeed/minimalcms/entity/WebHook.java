package com.saeed.minimalcms.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class WebHook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String url;
    private boolean triggerCreate;
    private boolean triggerUpdate;
    private boolean triggerDelete;

    @OneToMany(mappedBy = "webHook")
    private List<WebHookHeader> headers = new ArrayList<>();

    protected WebHook() {}

    public WebHook(String name, String url, boolean triggerCreate, boolean triggerUpdate, boolean triggerDelete) {
        this.name = name;
        this.url = url;
        this.triggerCreate = triggerCreate;
        this.triggerUpdate = triggerUpdate;
        this.triggerDelete = triggerDelete;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isTriggerCreate() {
        return triggerCreate;
    }

    public void setTriggerCreate(boolean triggerCreate) {
        this.triggerCreate = triggerCreate;
    }

    public boolean isTriggerUpdate() {
        return triggerUpdate;
    }

    public void setTriggerUpdate(boolean triggerUpdate) {
        this.triggerUpdate = triggerUpdate;
    }

    public boolean isTriggerDelete() {
        return triggerDelete;
    }

    public void setTriggerDelete(boolean triggerDelete) {
        this.triggerDelete = triggerDelete;
    }

    public List<WebHookHeader> getHeaders() {
        return headers;
    }

    public void addHeader(WebHookHeader header) {
        this.headers.add(header);
    }
}
