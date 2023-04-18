package com.base.project.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "tb_task")
@Data
public class TaskModel extends LessonModel{
    private String description;
    private Integer questionCount;
    private Integer approvalCount;
    private Double weight;
    private LocalDate dueDate;
}
