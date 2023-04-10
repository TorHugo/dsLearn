package com.base.project.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_course")
@Data
public class CourseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String imgUri;
    private String imgGrayUri;

    @OneToMany(mappedBy = "course")
    private List<OfferModel> offers = new ArrayList<>();
}
