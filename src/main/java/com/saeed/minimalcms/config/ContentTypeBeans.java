package com.saeed.minimalcms.config;

import com.saeed.minimalcms.entity.ContentType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContentTypeBeans {
    @Bean(name = "about")
    public ContentType about() {
        return new ContentType(
                "about",
                "about",
                "abouts",
                com.saeed.minimalcms.enums.ContentType.SINGLE);
    }

    @Bean(name = "article")
    public ContentType contentType() {
        return new ContentType(
                "article",
                "article",
                "articles",
                com.saeed.minimalcms.enums.ContentType.COLLECTION);
    }
}
