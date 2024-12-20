package com.saeed.minimalcms.repository;

import com.saeed.minimalcms.entity.WebHookHeader;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WebHookHeaderRepository extends JpaRepository<WebHookHeader, Integer> {
}
