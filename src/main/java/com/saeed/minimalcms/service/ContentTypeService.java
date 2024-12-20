package com.saeed.minimalcms.service;

import com.saeed.minimalcms.entity.ContentType;
import com.saeed.minimalcms.repository.ContentTypeRepository;
import com.saeed.minimalcms.repository.FieldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContentTypeService {
    @Autowired
    private ContentTypeRepository contentTypeRepository;

    @Autowired
    private FieldRepository fieldRepository;

    public List<ContentType> findAll() {
        return contentTypeRepository.findAll();
    }

    public ContentType findById(int id) {
        return contentTypeRepository.findById(id).orElse(null);
    }

    public ContentType create(ContentType contentType) {
        return contentTypeRepository.save(contentType);
    }

    public ContentType update(ContentType contentType) {
        return contentTypeRepository.save(contentType);
    }

    public void delete(int id) {
        contentTypeRepository.deleteById(id);
    }
}
