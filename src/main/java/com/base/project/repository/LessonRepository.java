package com.base.project.repository;

import com.base.project.model.entity.LessonModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonRepository extends JpaRepository<LessonModel, Long> {
}
