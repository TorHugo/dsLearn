package com.base.project.model.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tb_content")
@Data
public class ContentModel extends LessonModel{
    private String textContent;
    private String videoUri;
}
