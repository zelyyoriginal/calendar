package com.zelyy.calendar.services;

import com.zelyy.calendar.jpa.event;
import com.zelyy.calendar.jpa.repository_event;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

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
}
