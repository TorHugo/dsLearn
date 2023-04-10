package com.base.project.resource;

import com.base.project.service.TestingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/testing")
public class TestResource {

    @Autowired
    private TestingService testingService;

    @GetMapping
    public ResponseEntity<String> helloWorld(){
       return ResponseEntity.ok().body("Hello World!");
    }
}
