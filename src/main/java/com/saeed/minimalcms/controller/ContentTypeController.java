package com.saeed.minimalcms.controller;

import com.saeed.minimalcms.entity.Component;
import com.saeed.minimalcms.entity.ContentType;
import com.saeed.minimalcms.entity.Field;
import com.saeed.minimalcms.producer.Sender;
import com.saeed.minimalcms.service.ComponentService;
import com.saeed.minimalcms.service.ContentTypeService;
import com.saeed.minimalcms.service.FieldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/content-types")
public class ContentTypeController {
    @Autowired
    ContentTypeService contentTypeService;

    @Autowired
    ComponentService componentService;

    @Autowired
    FieldService fieldService;

    @Autowired
    private Sender sender;

    @GetMapping
    public List<ContentType> getAll() {
        return contentTypeService.findAll();
    }

    @GetMapping("/{id}")
    public ContentType getById(@PathVariable int id) {
        return contentTypeService.findById(id);
    }

    @PostMapping
    public ContentType create(@RequestBody ContentType contentType) {
        ContentType created = contentTypeService.create(contentType);
        sender.sendContentType(created);
        return created;
    }

    @PutMapping("/{id}")
    public ContentType update(@PathVariable int id, @RequestBody ContentType contentType) {
        contentType.setId(id);
        ContentType updated = contentTypeService.update(contentType);
        sender.sendContentType(updated);
        return updated;
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id) {
        ContentType contentType = contentTypeService.findById(id);
        contentTypeService.delete(id);
        sender.sendContentType(contentType);
    }

    @PostMapping("/{id}/fields")
    public ContentType addField(@PathVariable int id, @RequestBody Field field) {
        ContentType contentType = contentTypeService.findById(id);
        fieldService.addContentType(contentType, field);
        return contentType;
    }

    @PutMapping("/{id}/fields/{fieldId}")
    public ContentType editField(
            @PathVariable int id,
            @PathVariable int fieldId,
            @RequestBody Field field) {
        Field retrievedField = fieldService.findById(fieldId);
        retrievedField.setType(field.getType());
        retrievedField.setName(field.getName());
        retrievedField.setPrivate(field.isPrivate());
        retrievedField.setUnique(field.isUnique());

        fieldService.update(retrievedField);
        return contentTypeService.findById(id);
    }

    @DeleteMapping("/{id}/fields/{fieldId}")
    public void deleteField(@PathVariable int id, @PathVariable int fieldId) {
        fieldService.delete(fieldId);
    }

    @PostMapping("/{id}/components")
    public ContentType addComponent(
            @PathVariable int id,
            @RequestBody Component component) {
        ContentType contentType = contentTypeService.findById(id);
        componentService.addContentType(contentType, component);
        return contentType;
    }

    @PutMapping("/{id}/components/{componentId}")
    public ContentType editComponent(
            @PathVariable int id,
            @PathVariable int componentId,
            @RequestBody Component component) {
        Component retrievedComp = componentService.findById(componentId);
        retrievedComp.setName(component.getName());
        componentService.update(component);
        return contentTypeService.findById(id);
    }

    @DeleteMapping("/{id}/components/{componentId}")
    public void deleteComponent(@PathVariable int id, @PathVariable int componentId) {
        componentService.delete(componentId);
    }
}
