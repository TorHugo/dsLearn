package com.base.project.repository;

import com.base.project.model.entity.CourseModel;
import com.base.project.model.entity.SectionModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SectionRepository extends JpaRepository<SectionModel, Long> {
}
