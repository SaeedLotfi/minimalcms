package com.saeed.minimalcms.service;

import com.saeed.minimalcms.entity.Component;
import com.saeed.minimalcms.entity.ContentType;
import com.saeed.minimalcms.repository.ComponentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComponentService {
    @Autowired
    private ComponentRepository componentRepository;

    public Component findById(int id) {
        return componentRepository.findById(id).orElse(null);
    }

    public Component addContentType(ContentType contentType, Component component) {
        component.addContentType(contentType);
        return componentRepository.save(component);
    }

    public Component update(Component component) {
        return componentRepository.save(component);
    }

    public void delete(int id) {
        componentRepository.deleteById(id);
    }
}
