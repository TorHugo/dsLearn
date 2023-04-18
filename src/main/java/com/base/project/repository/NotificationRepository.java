package com.base.project.repository;

import com.base.project.model.entity.CourseModel;
import com.base.project.model.entity.NotificationModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<NotificationModel, Long> {
}
