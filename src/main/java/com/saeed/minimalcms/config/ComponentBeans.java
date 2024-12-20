package com.saeed.minimalcms.config;

import com.saeed.minimalcms.entity.Component;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ComponentBeans {
    @Bean(name = "sharedComponent")
    public Component shared() {
        return new Component("shared");
    }

    @Bean(name = "commonComponent")
    public Component common() {
        return new Component("common");
    }
}
