package com.base.project.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_offer")
@Data
public class OfferModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String edition;
    private LocalDateTime startMoment;
    private LocalDateTime endMoment;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private CourseModel course;
}
