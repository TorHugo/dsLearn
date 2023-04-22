package com.base.project.model.dto;

import com.base.project.model.entity.NotificationModel;
import com.base.project.model.entity.UserModel;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class NotificationDTO {

    private Long id;
    private String text;
    private LocalDateTime moment;
    private Boolean read;
    private String route;
    private Long idUser;

    public NotificationDTO(NotificationModel entity){
        this.id = entity.getId();
        this.text = entity.getText();
        this.moment = entity.getMoment();
        this.read = entity.getRead();
        this.route = entity.getRoute();
        this.idUser = entity.getUser().getId();
    }
}
