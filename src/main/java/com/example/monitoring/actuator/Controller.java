package com.example.monitoring.actuator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private Logger LOG = LoggerFactory
            .getLogger(Controller.class);

    @GetMapping("/hi")
    public String hello(){
        LOG.warn("hi loki endpoint");
        return "hello";
    }
}
