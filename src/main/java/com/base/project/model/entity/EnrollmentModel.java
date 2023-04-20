package com.base.project.model.entity;

import com.base.project.model.pKey.EnrollmentPK;
import javax.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_enrollment")
@Data
public class EnrollmentModel {

    @EmbeddedId
    private EnrollmentPK id = new EnrollmentPK();
    private LocalDateTime enrollMoment;
    private LocalDateTime refundMoment;
    private Boolean available;
    private Boolean onlyUpdate;

    @ManyToMany(mappedBy = "enrollmentsDone")
    private List<LessonModel> lessonsDone = new ArrayList<>();

    @OneToMany(mappedBy = "enrollment")
    private List<DeliverModel> deliveries = new ArrayList<>();

    public EnrollmentModel() {
    }

    public EnrollmentModel(UserModel user, OfferModel offer, LocalDateTime enrollMoment, LocalDateTime refundMoment, Boolean available, Boolean onlyUpdate) {
        super();
        this.id.setUser(user);
        this.id.setOffer(offer);
        this.enrollMoment = enrollMoment;
        this.refundMoment = refundMoment;
        this.available = available;
        this.onlyUpdate = onlyUpdate;
    }

    public UserModel getStudent(){
        return id.getUser();
    }

    public void setStudent(UserModel student){
        id.setUser(student);
    }

    public OfferModel getOffer(){
        return id.getOffer();
    }

    public void setStudent(OfferModel offer){
        id.setOffer(offer);
    }
}
