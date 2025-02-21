package com.capgeminitraining.UC3;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class Hello {
    @GetMapping( "param/{name}")
    public String sayHello(@PathVariable String name){
        return "Hello "+name +" from BridgeLabz!";
    }
}
