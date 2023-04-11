package com.base.project.model.pKey;

import com.base.project.model.entity.OfferModel;
import com.base.project.model.entity.UserModel;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.io.Serializable;

@Data
@Embeddable
public class EnrollmentPK implements Serializable {
    private static final long serialVersionUID = 1L;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserModel user;

    @ManyToOne
    @JoinColumn(name = "offer_id")
    private OfferModel offer;
}
