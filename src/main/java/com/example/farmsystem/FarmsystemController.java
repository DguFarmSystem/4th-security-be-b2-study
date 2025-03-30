package com.example.farmsystem;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FarmsystemController {
    
    @RequestMapping("/Home")
    public String Home(){
        return "Hello World1";
    }

    @RequestMapping("/Home/tutorial")
    public String tutorial(){
        return "tutorial class";
    }
}
