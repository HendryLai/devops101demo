package com.ibm.consulting.university.devops;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloWorldController {

    @GetMapping("/greeting")
    String greeting() {
        return "Hello World!";
    }


}
