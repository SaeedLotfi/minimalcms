package com.saeed.minimalcms.repository;

import com.saeed.minimalcms.entity.WebHook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WebHookRepository extends JpaRepository<WebHook, Integer> {
}
