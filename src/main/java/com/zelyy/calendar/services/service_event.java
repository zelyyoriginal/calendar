package com.zelyy.calendar.services;

import com.zelyy.calendar.jpa.Event;
import com.zelyy.calendar.jpa.repository_event;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class service_event {

    public repository_event repo;


    public service_event(repository_event event) {
        repo = event;
    }

    public Event save(Event event) {
       return repo.save(event);
    }

    public List<Event> getBetween(int groupId) {
        LocalDate start = LocalDate.now();
        LocalDate end = start.plusDays(7);
        List<Event> result = repo.findEventsByGrupIdAndNdayBetween(groupId,start,end);

      result.sort((a,b)-> a.getNday().compareTo(b.getNday()));
      return result;
    }

    public List<Event> getEventDay(LocalDate curent, int id) {

        return repo.findEventsByGrupIdAndNday(id,curent);
    }




    public List<LocalDate> getDay(int groupId) {
      List<Event> events = repo.findEventsByGrupId(groupId);

      return events.stream().map(a->a.getNday()).toList();
    }

    public void deleteEvent(Integer id) {
        repo.removeEventsById(id);
    }


}