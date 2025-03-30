package com.example.farmsystem;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FarmsystemController {
    @GetMapping("/")
    @ResponseBody
    public String home(){
        return "This is home page";
    }
}
