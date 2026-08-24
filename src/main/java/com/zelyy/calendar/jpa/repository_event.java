package com.zelyy.calendar.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface repository_event extends JpaRepository<Event, Integer> {

    List<Event> findEventsByNday(LocalDate nday);

    List<Event> findEventsByNdayBetween(LocalDate start, LocalDate end);

    List<Event> findEventsByGrupIdAndNdayBetween(Integer groupId, LocalDate start, LocalDate end);

    List<Event> findEventsByGrupId(int groupId);

    void removeEventsById(int id);
    List<Event> findEventsByGrupIdAndNday(Integer groupId, LocalDate date);
}