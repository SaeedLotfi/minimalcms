package com.saeed.minimalcms.controller;

import com.saeed.minimalcms.entity.Field;
import com.saeed.minimalcms.entity.WebHookHeader;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/web-hooks")
public class WebHookController {
    @GetMapping
    public List<WebHookController> getAll() {
        return new ArrayList<>();
    }

    @GetMapping("/{id}")
    public WebHookController getById(@PathVariable int id) {
        return null;
    }

    @PostMapping
    public WebHookController create(@RequestBody WebHookController webHook) {
        return null;
    }

    @PutMapping("/{id}")
    public WebHookController update(@PathVariable int id, @RequestBody WebHookController webHook) {
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id) {
        return;
    }

    @PostMapping("/{id}/headers")
    public Field addHeader(@PathVariable int id, @RequestBody WebHookHeader header) {
        return null;
    }

    @PutMapping("/{id}/headers/{headerId}")
    public Field editHeader(
            @PathVariable int id,
            @PathVariable int headerId,
            @RequestBody WebHookHeader header) {
        return null;
    }

    @DeleteMapping("/{id}/headers/{headerId}")
    public void deleteHeader(@PathVariable int id, @PathVariable int headerId) {
        return;
    }
}
