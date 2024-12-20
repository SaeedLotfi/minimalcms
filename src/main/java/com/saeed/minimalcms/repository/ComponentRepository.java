package com.saeed.minimalcms.repository;

import com.saeed.minimalcms.entity.Component;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComponentRepository extends JpaRepository<Component, Integer> {
}
