package com.base.project.repository;

import com.base.project.model.entity.EnrollmentModel;
import com.base.project.model.pKey.EnrollmentPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentRepository extends JpaRepository<EnrollmentModel, EnrollmentPK> {
}
