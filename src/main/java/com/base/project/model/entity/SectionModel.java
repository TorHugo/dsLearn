package com.base.project.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tb_section")
@Data
public class SectionModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String imgUri;
    private Integer position;

    @ManyToOne
    @JoinColumn(name = "resource_id")
    private ResourceModel resource;

    @ManyToOne
    @JoinColumn(name = "pre_requisite_id")
    private SectionModel preRequisite;
}
