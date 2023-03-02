package com.example.madspilde.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Home {

    @GetMapping("/index")
    public String index(){
        return "index";
    }
    @GetMapping("/")
    public String homeEmpty(){
        return "index";
    }
    @GetMapping("/home")
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
    @GetMapping("/forfallesskab")
    public String fallesskab(){
        return "forfallesskab";
    }
    @GetMapping("/formadplan")
    public String madplan(){
        return "formadplan";
    }
    @GetMapping("/foropbevaring")
    public String opbevaring(){
        return "foropbevaring";
    }

    @GetMapping("/foropskrifter")
    public String opskrifter(){
        return "foropskrifter";
    }

    @GetMapping("/orgpartner")
    public String partner(){
        return "orgpartner";
    }
    @GetMapping("/orgdataindsamling")
    public String data(){
        return "orgdataindsamling";
    }
    @GetMapping("/orgresourcestyring")
    public String resource(){
        return "orgresourcestyring";
    }
    @GetMapping("/orgrapporter")
    public String rapport(){
        return "orgrapporter";
    }
    @GetMapping("/contact")
        public String kontakt() {
        return "contact";
    }
    @GetMapping("/mailformular")
    public String mail() {
        return "mailformular";
    }

}
