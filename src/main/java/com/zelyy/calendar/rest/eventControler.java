package com.zelyy.calendar.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class eventControler {

    @GetMapping("/form")
    public String getForm(){
        return "redirect:/form.html";
    }
}
