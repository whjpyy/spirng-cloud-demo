package com.chen.cloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private ScheduleServiceHi scheduleServiceHi;

    @GetMapping("/hi")
    public String hi(@RequestParam String name){
        return "feign: " + scheduleServiceHi.sayHiFromClientOne(name);
    }
}
