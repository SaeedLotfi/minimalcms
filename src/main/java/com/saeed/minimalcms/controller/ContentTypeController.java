package com.saeed.minimalcms.controller;

import com.saeed.minimalcms.entity.Component;
import com.saeed.minimalcms.entity.ContentType;
import com.saeed.minimalcms.entity.Field;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/content-types")
public class ContentTypeController {
    @GetMapping
    public List<ContentType> getAll() {
        return new ArrayList<ContentType>();
    }

    @GetMapping("/{id}")
    public ContentType getById(@PathVariable int id) {
        return null;
    }

    @PostMapping
    public ContentType create(@RequestBody ContentType contentType) {
        return null;
    }

    @PutMapping("/{id}")
    public ContentType update(@PathVariable int id, @RequestBody ContentType contentType) {
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id) {
        return;
    }

    @PostMapping("/{id}/fields")
    public Field addField(@PathVariable int id, @RequestBody Field field) {
        return null;
    }

    @PutMapping("/{id}/fields/{fieldId}")
    public Field editField(
            @PathVariable int id,
            @PathVariable int fieldId,
            @RequestBody Field field) {
        return null;
    }

    @DeleteMapping("/{id}/fields/{fieldId}")
    public void deleteField(@PathVariable int id, @PathVariable int fieldId) {
        return;
    }

    @PostMapping("/{id}/components")
    public Field addComponent(
            @PathVariable int id,
            @RequestBody Component component) {
        return null;
    }

    @PutMapping("/{id}/components/{componentId}")
    public Field editComponent(
            @PathVariable int id,
            @PathVariable int componentId,
            @RequestBody Component component) {
        return null;
    }

    @DeleteMapping("/{id}/components/{componentId}")
    public void deleteComponent(@PathVariable int id, @PathVariable int componentId) {
        return;
    }
}
