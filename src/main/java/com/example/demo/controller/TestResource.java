package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Fred.Chen
 * @since 8/27/2023
 */
@RestController
@RequestMapping("/api")
public class TestResource {

    private final Logger log = LoggerFactory.getLogger(TestResource.class);

    @GetMapping("/test")
    public ResponseEntity<String> test() {
        log.debug("test endpoint!!!");
        System.out.println("syst out!!!");

        return new ResponseEntity<>("Test endpoint !!!", HttpStatus.OK);
    }

    @GetMapping("/test/error")
    public ResponseEntity<String> testerror() {
        log.debug("test error endpoint!!!");
        int i = 10/0;

        return new ResponseEntity<>("Test error endpoint !!!", HttpStatus.OK);
    }
}
