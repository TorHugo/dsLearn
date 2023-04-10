package com.base.project.service;

import com.base.project.model.dto.TestingDTO;
import org.springframework.stereotype.Component;

@Component
public interface TestingService {
    void testingMethod(final TestingDTO testingDTO);
}
