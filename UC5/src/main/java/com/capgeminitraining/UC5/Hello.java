package com.capgeminitraining.UC5;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class Hello {
    @PutMapping("put/{firstname}")
    public String sayHello(@PathVariable String firstname, @RequestParam(value="lastname" )String lastname){
        return "Hello "+firstname + lastname +" from BridgeLabz!";
    }
}