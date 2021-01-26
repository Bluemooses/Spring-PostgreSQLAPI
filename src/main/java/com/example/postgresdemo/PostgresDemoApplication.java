package com.example.postgresdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class PostgresDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(PostgresDemoApplication.class, args);
    }

    @GetMapping("/get")
    public @ResponseBody
    ResponseEntity<String> get() {
        return new ResponseEntity<String>("GET Response", HttpStatus.OK);
    }


}
