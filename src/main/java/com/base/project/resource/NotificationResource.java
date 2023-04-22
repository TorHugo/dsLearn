package com.base.project.resource;

import com.base.project.model.dto.NotificationDTO;
import com.base.project.model.dto.UserDTO;
import com.base.project.service.NotificationService;
import com.base.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.base.project.util.ResponseUtils.successful;

@RestController
@RequestMapping(value = "/api/notifications")
public class NotificationResource {

    @Autowired
    private NotificationService notificationService;

    @GetMapping()
    public ResponseEntity<Page<NotificationDTO>> notificationForCurrentUser
            (final Pageable pageable){
        final Page<NotificationDTO> page = notificationService.notificationForCurrentUser(pageable);
        return  ResponseEntity.status(successful).body(page);
    }
}
