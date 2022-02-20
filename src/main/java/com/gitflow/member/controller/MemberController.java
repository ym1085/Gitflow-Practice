package com.gitflow.member.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class MemberController {

    private final Logger log = LoggerFactory.getLogger(MemberController.class);

    @GetMapping("/user")
    public ResponseEntity<String> login() {
        return ResponseEntity.ok().body("로그인 완료");
    }
}
