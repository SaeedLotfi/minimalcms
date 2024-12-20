package com.saeed.minimalcms.controller;

import com.saeed.minimalcms.entity.Content;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/contents")
public class ContentController {
    @GetMapping
    public List<Content> getAll() {
        return new ArrayList<>();
    }

    @GetMapping("/{id}")
    public Content getById(@PathVariable int id) {
        return null;
    }

    @PostMapping
    public Content create(@RequestBody Content content) {
        return null;
    }

    @PutMapping("/{id}")
    public Content update(@PathVariable int id, @RequestBody Content content) {
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id) {
        return;
    }
}
