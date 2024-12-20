package com.saeed.minimalcms.entity;

import jakarta.persistence.*;

@Entity
public class WebHookHeader {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Enumerated(EnumType.STRING)
    private com.saeed.minimalcms.enums.WebHookHeader header;

    @ManyToOne
    @JoinColumn(name = "WEBHOOK_ID", nullable = false)
    private WebHook webHook;

    protected WebHookHeader() {}

    public WebHookHeader(com.saeed.minimalcms.enums.WebHookHeader header, WebHook webHook) {
        this.header = header;
        this.webHook = webHook;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public com.saeed.minimalcms.enums.WebHookHeader getHeader() {
        return header;
    }

    public void setHeader(com.saeed.minimalcms.enums.WebHookHeader header) {
        this.header = header;
    }

    public WebHook getWebHook() {
        return webHook;
    }

    public void setWebHook(WebHook webHook) {
        this.webHook = webHook;
    }
}
