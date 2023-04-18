package com.base.project.repository;

import com.base.project.model.entity.CourseModel;
import com.base.project.model.entity.RoleModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<RoleModel, Long> {
}
