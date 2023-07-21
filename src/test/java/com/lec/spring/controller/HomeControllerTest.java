package com.lec.spring.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class HomeControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void hello_테스트(){
        ResponseEntity<String> response = restTemplate.getForEntity("/aws/v3", String.class);
        assertEquals("<h1>aws v3</h1>", response.getBody());
    }

}