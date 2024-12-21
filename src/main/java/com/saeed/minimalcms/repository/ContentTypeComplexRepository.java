package com.saeed.minimalcms.repository;

import com.saeed.minimalcms.entity.ContentType;

import java.util.List;

public interface ContentTypeComplexRepository {
    List<ContentType> filterContentTypes(String contentTypeName, String fieldName, com.saeed.minimalcms.enums.ContentType type);
}

