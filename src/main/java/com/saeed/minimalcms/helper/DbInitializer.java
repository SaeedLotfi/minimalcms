package com.saeed.minimalcms.helper;

import com.saeed.minimalcms.entity.Component;
import com.saeed.minimalcms.entity.ContentType;
import com.saeed.minimalcms.entity.Field;
import com.saeed.minimalcms.repository.ComponentRepository;
import com.saeed.minimalcms.repository.ContentTypeRepository;
import com.saeed.minimalcms.repository.FieldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;

@org.springframework.stereotype.Component
public class DbInitializer implements CommandLineRunner {
    @Autowired
    private ApplicationContext context;

    @Autowired
    private ContentTypeRepository contentTypeRepository;

    @Autowired
    private ComponentRepository componentRepository;

    @Autowired
    private FieldRepository fieldRepository;

    @Override
    public void run(String... args) throws Exception {
//        Component sharedComponent = context.getBean("sharedComponent", Component.class);
//        Component commonComponent = context.getBean("commonComponent", Component.class);
//        componentRepository.save(commonComponent);
//        componentRepository.save(sharedComponent);
//
//        Field titleField1 = context.getBean("titleField", Field.class);
//        Field titleField2 = context.getBean("titleField", Field.class);
//        Field titleField3 = context.getBean("titleField", Field.class);
//        Field descriptionField1 = context.getBean("descriptionField", Field.class);
//        Field descriptionField2 = context.getBean("descriptionField", Field.class);
//        Field descriptionField3 = context.getBean("descriptionField", Field.class);
//        Field authorField = context.getBean("authorField", Field.class);
//        Field publisherField = context.getBean("publisherField", Field.class);
//        Field isPublishedField = context.getBean("isPublishedField", Field.class);
//
//        titleField1.addComponent(sharedComponent);
//        fieldRepository.save(titleField1);
//
//        descriptionField1.addComponent(sharedComponent);
//        fieldRepository.save(descriptionField1);
//
//        titleField2.addComponent(commonComponent);
//        fieldRepository.save(titleField2);
//
//        descriptionField2.addComponent(commonComponent);
//        fieldRepository.save(descriptionField2);
//
//        ContentType about = context.getBean("about", ContentType.class);
//        contentTypeRepository.save(about);
//
//        titleField3.addContentType(about);
//        fieldRepository.save(titleField3);
//        descriptionField3.addContentType(about);
//        fieldRepository.save(descriptionField3);
//
//        ContentType article = context.getBean("article", ContentType.class);
//        contentTypeRepository.save(article);
//        sharedComponent.addContentType(article);
//        commonComponent.addContentType(article);
//        componentRepository.save(sharedComponent);
//        componentRepository.save(commonComponent);
//
//        authorField.addContentType(article);
//        fieldRepository.save(authorField);
//        publisherField.addContentType(article);
//        fieldRepository.save(publisherField);
//        isPublishedField.addContentType(article);
//        fieldRepository.save(isPublishedField);
    }
}
