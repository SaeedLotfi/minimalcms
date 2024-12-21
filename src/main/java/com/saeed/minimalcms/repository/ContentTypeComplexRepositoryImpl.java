package com.saeed.minimalcms.repository;

import com.saeed.minimalcms.entity.ContentType;
import com.saeed.minimalcms.entity.Field;
import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Objects;

@Repository
public class ContentTypeComplexRepositoryImpl implements ContentTypeComplexRepository {
    @Autowired
    private EntityManager entityManager;

    public List<ContentType> filterContentTypes(
            String contentTypeName, String fieldName, com.saeed.minimalcms.enums.ContentType type) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<ContentType> query = cb.createQuery(ContentType.class);
        Root<ContentType> contentTypeRoot = query.from(ContentType.class);
        Join<ContentType, Field> fieldsJoin = contentTypeRoot.join("fields", JoinType.LEFT);

        Predicate predicate = cb.conjunction();
        if (StringUtils.hasText(contentTypeName))
            predicate = cb.and(predicate, cb.equal(contentTypeRoot.get("name"), contentTypeName));
        if (StringUtils.hasText(fieldName))
            predicate = cb.and(predicate, cb.like(fieldsJoin.get("name"), "%" + fieldName + "%"));
        if (Objects.nonNull(type))
            predicate = cb.and(predicate, cb.equal(contentTypeRoot.get("type"), type));

        query.select(contentTypeRoot).where(predicate).distinct(true);
        return entityManager.createQuery(query).getResultList();
    }
}
