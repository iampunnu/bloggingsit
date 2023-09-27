package com.project.boggingsite.blog;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BlogRepository extends JpaRepository<BlogEntity, UUID> {

}
