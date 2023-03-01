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
    @GetMapping("/for_fallesskab")
    public String fallesskab(){
        return "forfallesskab";
    }
    @GetMapping("/for_madplan")
    public String madplan(){
        return "formadplan";
    }
    @GetMapping("/for_opbevaring")
    public String opbevaring(){
        return "foropbevaring";
    }

    @GetMapping("/for_opskrifter")
    public String opskrifter(){
        return "foropskrifter";
    }
    @GetMapping("/for_tips")
    public String tips(){
        return "fortips";
    }
}
