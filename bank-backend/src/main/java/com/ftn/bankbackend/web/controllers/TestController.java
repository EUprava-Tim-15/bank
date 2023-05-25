package com.ftn.bankbackend.web.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "hello")
public class TestController {


    @GetMapping
    public ResponseEntity<String> hello() {
        return new ResponseEntity<>( "Hello ", HttpStatus.OK);
    }
}
