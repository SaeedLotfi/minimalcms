package com.saeed.minimalcms.repository;

import com.saeed.minimalcms.entity.Content;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContentRepository extends JpaRepository<Content, Integer> {
}
