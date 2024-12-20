package com.saeed.minimalcms.service;

import com.saeed.minimalcms.entity.ContentType;
import com.saeed.minimalcms.entity.Field;
import com.saeed.minimalcms.repository.FieldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FieldService {
    @Autowired
    private FieldRepository fieldRepository;

    public Field findById(int id) {
        return fieldRepository.findById(id).orElse(null);
    }

    public Field addContentType(ContentType contentType, Field field) {
        field.addContentType(contentType);
        return fieldRepository.save(field);
    }

    public Field update(Field field) {
        return fieldRepository.save(field);
    }

    public void delete(int id) {
        fieldRepository.deleteById(id);
    }
}
