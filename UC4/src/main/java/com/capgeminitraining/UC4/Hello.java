package com.capgeminitraining.UC4;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class Hello {
    @PostMapping("put/{firstname}")
    public String sayHello(@PathVariable String firstname, @RequestParam(value="lastname" )String lastname){
        return "Hello "+firstname + lastname +" from BridgeLabz!";
    }
}
