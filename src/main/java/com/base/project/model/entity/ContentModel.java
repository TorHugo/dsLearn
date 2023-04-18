package com.base.project.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tb_content")
@Data
public class ContentModel extends LessonModel{
    private String textContent;
    private String videoUri;
}
