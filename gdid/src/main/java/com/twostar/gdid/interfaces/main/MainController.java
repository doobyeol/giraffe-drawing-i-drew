package com.twostar.gdid.interfaces.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller
public class MainController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
