package com.base.project.repository;

import com.base.project.model.entity.CourseModel;
import com.base.project.model.entity.ResourceModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResourceRepository extends JpaRepository<ResourceModel, Long> {
}
