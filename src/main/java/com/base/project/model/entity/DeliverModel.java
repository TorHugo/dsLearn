package com.base.project.model.entity;

import com.base.project.model.enums.DeliverStatus;
import javax.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_deliver")
@Data
public class DeliverModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String uri;
    private LocalDateTime moment;

    private DeliverStatus status;
    private String feedback;
    private Integer correctCount;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "offer_id"),
            @JoinColumn(name = "user_id")
    })
    private EnrollmentModel enrollment;

    @ManyToOne
    @JoinColumn(name = "lesson_id")
    private LessonModel lesson;
}
