package com.base.project.model.dto;

import com.base.project.model.enums.DeliverStatus;
import lombok.Data;

@Data
public class DeliverRevisionDTO {
    private DeliverStatus status;
    private String feedback;
    private Integer correctCount;
}
