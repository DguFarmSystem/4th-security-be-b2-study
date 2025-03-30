package com.example.farmsystem;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FarmsystemController {
    
    @RequestMapping("/Home")
    public String Home(){
        return "this is a change only on FS_1stbranch";
    }
}
