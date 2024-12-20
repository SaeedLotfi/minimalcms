package com.saeed.minimalcms.producer;

import com.saeed.minimalcms.entity.ContentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class Sender {
    @Autowired
    private JmsTemplate jmsTemplate;

    @Value("${springjms.cs544queue}")
    private String queueName;

    public void sendContentType(ContentType contentType) {
        Map<String, Object> params = new HashMap<>();
        params.put("id", contentType.getId());
        params.put("type", contentType.getType().toString());
        params.put("name", contentType.getName());
        params.put("apiName", contentType.getApiName());
        params.put("apiNamePlural", contentType.getApiNamePlural());
        jmsTemplate.convertAndSend(queueName, params);
    }
}
