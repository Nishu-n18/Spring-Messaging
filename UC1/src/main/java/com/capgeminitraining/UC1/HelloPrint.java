package com.capgeminitraining.UC1;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloPrint {
    @RequestMapping (value={"","/","/home"})
    public String sayHello(){
        return "Hello from BridgeLabz!";
    }
}
