package com.base.project.service.impl;

import com.base.project.model.dto.NotificationDTO;
import com.base.project.model.entity.NotificationModel;
import com.base.project.model.entity.UserModel;
import com.base.project.repository.NotificationRepository;
import com.base.project.service.AuthService;
import com.base.project.service.NotificationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
public class NotificationServiceImpl implements NotificationService {

    @Autowired
    private AuthService authService;

    @Autowired
    private NotificationRepository notificationRepository;

    @Override
    @Transactional(readOnly = true)
    public Page<NotificationDTO> notificationForCurrentUser(final Pageable pageable) {
        log.info("1. Authenticated user.");
        final UserModel user = authService.authenticated();
        log.info("2. Find all notifications by idUser: {}", user.getId());
        final Page<NotificationModel> page = notificationRepository.findByUser(user, pageable);
        return page.map(NotificationDTO::new);
    }
}
