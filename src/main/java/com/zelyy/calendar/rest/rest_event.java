package com.zelyy.calendar.rest;

import com.zelyy.calendar.jpa.Event;
import com.zelyy.calendar.services.service_event;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/")
public class rest_event {
    public static final String API_CALENDAR = "api/calendar";
    private final service_event service;

    public rest_event(service_event service) {
        this.service = service;
    }

    @PostMapping(API_CALENDAR)
    public Event save(@RequestBody Event event) {
      return service.save(event);
    }

    @GetMapping("/getBetween")//ближайшие события (от сегодня + 7 дней)
    public List<Event> getBetween(@RequestParam(value = "groupId",defaultValue = "0") int groupId){

        return service.getBetween(groupId);
    }
    @PostMapping(API_CALENDAR+"/day")
    public List<Event> getEventsDey(@RequestBody IdAndDate idAndDate){
        return service.getEventDay(idAndDate.date, idAndDate.id);
    }

    @GetMapping(API_CALENDAR)
    public List<LocalDate> getDay(@RequestParam(value = "groupId",defaultValue = "0") int groupId){

        return service.getDay(groupId);
    }
    @DeleteMapping(API_CALENDAR)
    public void deleteEvents(@RequestBody Integer id){
        service.deleteEvent(id);
    }
    public record IdAndDate(LocalDate date,Integer id){}
}


