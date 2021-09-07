package com.fortech.miroclonebackend;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
@Slf4j
public class HelloController {

    @GetMapping("hello")
    public String hello(){
        log.info("Controller accessed");
        return "Hello World!";
    }
}
