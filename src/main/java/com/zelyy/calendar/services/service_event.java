package com.zelyy.calendar.services;

import com.zelyy.calendar.jpa.event;
import com.zelyy.calendar.jpa.repository_event;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class service_event {

    public repository_event repo;


    public service_event(repository_event event) {
        repo = event;
    }

    public void save() {
        event big = new event();
        LocalDate a = LocalDate.now();
        big.setNday(a);
        big.setName("большие гонки");
        big.setTitle("какоето долгое описание");
        repo.save(big);
    }

    public List<event> getBetween() {
        LocalDate start = LocalDate.now();
        LocalDate end = start.plusDays(7);
        return repo.findEventsByNdayBetween(start, end);
    }
}