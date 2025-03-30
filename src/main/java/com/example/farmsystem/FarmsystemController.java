package com.example.farmsystem;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FarmsystemController {
    
    @RequestMapping("/Home")
    public String Home()
    {
        return "Hello Farm System";
    }

    @RequestMapping("/tutorial")
    public String tutorial()
    {
        return "tutorial page + difference+";
    }
}

