package com.zelyy.calendar.rest;

import com.zelyy.calendar.jpa.event;
import com.zelyy.calendar.services.service_event;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/")
public class rest_event {
    private final service_event service;

    public rest_event(service_event service) {
        this.service = service;
    }

    @PostMapping("api/calendar")
    public event save(@RequestBody event event) {
      return service.save(event);
    }

    @GetMapping("/getBetween")//ближайшие события (от сегодня + 7 дней)
    public List<event> getBetween(){
        return service.getBetween();
    }
    @GetMapping("restapi/getDay/{date}")
    public List<event> getEventsDey(@PathVariable LocalDate date){
        return service.getEventDay(date);
    }

}


