package com.saeed.minimalcms.repository;

import com.saeed.minimalcms.entity.ContentType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ContentTypeRepository
        extends JpaRepository<ContentType, Integer>, ContentTypeComplexRepository {
    @Query("SELECT c FROM ContentType c " +
            "LEFT JOIN c.fields f " +
            "WHERE (:name IS NULL OR c.name = :name) " +
            "AND (:apiName IS NULL OR c.apiName LIKE CONCAT('%', :apiName, '%')) " +
            "AND (:type IS NULL OR c.type = :type) " +
            "AND (:field IS NULL OR f.name LIKE CONCAT('%', :field, '%'))")
    List<ContentType> filterContentTypes(
            String name,
            String apiName,
            String field,
            com.saeed.minimalcms.enums.ContentType type);

    @Query(name = "ContentType.advancedFilter")
    List<ContentType> advancedFilter(
            String name,
            com.saeed.minimalcms.enums.ContentType type,
            String componentName);
}
