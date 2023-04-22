package com.base.project.repository;

import com.base.project.model.entity.NotificationModel;
import com.base.project.model.entity.UserModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<NotificationModel, Long> {
    Page<NotificationModel> findByUser(UserModel userModel, Pageable pageable);
}
