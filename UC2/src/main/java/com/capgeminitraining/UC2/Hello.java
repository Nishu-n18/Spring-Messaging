package com.capgeminitraining.UC2;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class Hello {
    @RequestMapping(value={"/query"},method= RequestMethod.GET)
    public String sayHello(@RequestParam(value="name") String name){
        return "Hello "+name +" from BridgeLabz!";
    }
}
