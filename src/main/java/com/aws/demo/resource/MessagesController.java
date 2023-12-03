package com.aws.demo.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/message")
public class MessagesController {

    @GetMapping("/ball")
    ResponseEntity<String[]> getBall() {
        return ResponseEntity.ok(new String[]{"Subject", "Ball"});
    }
}
