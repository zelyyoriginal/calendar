package com.zelyy.calendar.rest;

import com.zelyy.calendar.services.service_event;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class rest_event {
    private service_event service;

    public rest_event(service_event service) {
        this.service = service;
    }


    @GetMapping("save")
    public void save() {
        service.save();
    }


}
