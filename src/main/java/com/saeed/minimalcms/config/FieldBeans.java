package com.saeed.minimalcms.config;

import com.saeed.minimalcms.entity.Field;
import com.saeed.minimalcms.enums.FieldType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FieldBeans {
    @Bean(name = "titleField")
    public Field getTitleField() {
        return new Field(FieldType.TEXT, "title", false, false);
    }

    @Bean(name = "descriptionField")
    public Field getDescriptionField() {
        return new Field(FieldType.TEXT, "description", false, false);
    }

    @Bean(name = "authorField")
    public Field getAuthorField() {
        return new Field(FieldType.TEXT, "author", false, false);
    }

    @Bean(name = "publisherField")
    public Field getPublisherField() {
        return new Field(FieldType.TEXT, "publisher", false, false);
    }

    @Bean(name = "isPublishedField")
    public Field getIsPublishedField() {
        return new Field(FieldType.BOOLEAN, "isPublished", false, false);
    }
}
