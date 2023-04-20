package com.base.project.model.entity;

import com.base.project.model.enums.ResourceType;
import javax.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_resource")
@Data
public class ResourceModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private Integer position;
    private String imgUri;
    private ResourceType type;

    @ManyToOne
    @JoinColumn(name = "offer_id")
    private OfferModel offer;

    @OneToMany(mappedBy = "resource")
    private List<SectionModel> sections = new ArrayList<>();
}
