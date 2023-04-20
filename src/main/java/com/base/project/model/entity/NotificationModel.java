package com.base.project.model.entity;

import javax.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_notification")
@Data
public class NotificationModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String text;
    private LocalDateTime moment;
    private Boolean read;
    private String route;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserModel user;
}
