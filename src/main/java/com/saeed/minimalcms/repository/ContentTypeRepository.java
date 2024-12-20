package com.saeed.minimalcms.repository;

import com.saeed.minimalcms.entity.ContentType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContentTypeRepository extends JpaRepository<ContentType, Long> {
}
