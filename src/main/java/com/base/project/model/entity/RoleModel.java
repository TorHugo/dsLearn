package com.base.project.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tb_roles")
@Data
public class RoleModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String authority;
}
