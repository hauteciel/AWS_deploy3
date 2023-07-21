package com.lec.spring.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HomeController {

    @Value("${env.info}")
    private String envInfo;

    @GetMapping("/aws/v3")
    public String hello(@RequestParam(defaultValue = "1") Integer num){
        if(num == 1){ // info 로그
            log.info("[" + envInfo + "] /aws/v3 이 호출. info 로그 #####################################");
        }else if(num == -1){ // error 로그
            log.error("[" + envInfo + "] /aws/v3 이 호출. error 로그 #####################################");
        }else if(num == 0){ // warn 로그
            log.warn("[" + envInfo + "] /aws/v3 이 호출. warn 로그 #####################################");
        }

        return "<h1>aws v3</h1>";
    }
}
