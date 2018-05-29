package com.example.taskthirt;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @GetMapping(value = "/answer/{name}")
    public ResponseEntity<String> answerWhom(@PathVariable String name){

        return new ResponseEntity<String>("Привет, "+name, HttpStatus.OK);
    }
}
