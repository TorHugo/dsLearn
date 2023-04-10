package com.base.project.service.impl;

import com.base.project.model.dto.TestingDTO;
import com.base.project.service.TestingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TestingServiceImpl implements TestingService {
    @Override
    public void testingMethod(TestingDTO testingDTO) {
        log.info("[1] - Logic");
    }
}
