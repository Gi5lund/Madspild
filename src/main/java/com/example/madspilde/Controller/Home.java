package com.example.madspilde.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Home {

    @GetMapping("/index")
    public String home(){
        return "index";
    }
    @GetMapping("/organisation")
    public  String organisation(){
        return "organisation";
    }
    @GetMapping("/virksomhed")
    public String virksomhed(){
        return "virksomhed";
    }
    @GetMapping("/forbruger")
    public String forbruger(){
        return "forbruger";
    }
}
