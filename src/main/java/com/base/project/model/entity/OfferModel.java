package com.base.project.model.entity;

import javax.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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

    @OneToMany(mappedBy = "offer")
    private List<ResourceModel> resources = new ArrayList<>();
}
