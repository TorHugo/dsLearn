package com.base.project.repository;

import com.base.project.model.entity.TestingModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestingRepository extends JpaRepository<TestingModel, Long> {
}
