package com.base.project.repository;

import com.base.project.model.entity.CourseModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<CourseModel, Long> {
}
