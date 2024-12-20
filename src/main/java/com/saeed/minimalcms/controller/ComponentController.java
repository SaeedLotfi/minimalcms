package com.saeed.minimalcms.controller;

import com.saeed.minimalcms.entity.Component;
import com.saeed.minimalcms.entity.Field;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/components")
public class ComponentController {
    @GetMapping
    public List<Component> getAll() {
        return new ArrayList<>();
    }

    @GetMapping("/{id}")
    public Component getById(@PathVariable int id) {
        return null;
    }

    @PostMapping
    public Component create(@RequestBody Component component) {
        return null;
    }

    @PutMapping("/{id}")
    public Component update(@PathVariable int id, @RequestBody Component component) {
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
}
