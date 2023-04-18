package com.base.project.repository;

import com.base.project.model.entity.CourseModel;
import com.base.project.model.entity.OfferModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OfferRepository extends JpaRepository<OfferModel, Long> {
}
