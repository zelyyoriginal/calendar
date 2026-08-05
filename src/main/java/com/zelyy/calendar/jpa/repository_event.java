package com.zelyy.calendar.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface repository_event extends JpaRepository<event, Integer> {

    List<event> findEventsByNday(LocalDate nday);


}
