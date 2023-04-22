package com.base.project.service;

import com.base.project.model.dto.NotificationDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface NotificationService {
    Page<NotificationDTO> notificationForCurrentUser(final Pageable pageable);
}
