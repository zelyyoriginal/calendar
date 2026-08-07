package com.zelyy.calendar.rest;

import com.zelyy.calendar.jpa.event;
import com.zelyy.calendar.services.service_event;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RestController
@RequestMapping("/")
public class rest_event {
    private final service_event service;

    public rest_event(service_event service) {
        this.service = service;
    }

    @PostMapping("save")
    public void save() {
        service.save();
    }

    @GetMapping("/getBetween")
    public List<event> getBetween(){
        return service.getBetween();
    }

}


