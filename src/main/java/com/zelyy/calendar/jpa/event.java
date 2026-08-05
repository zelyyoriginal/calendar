package com.zelyy.calendar.jpa;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "grup_id")
    private int grup_id;

    @Column(name = "nday")
    private LocalDate nday;

    @Column(name = "time")
    private String time;

    @Column(name = "name")
    private String name;

    @Column(name = "title")
    private String title;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getNday() {
        return nday;
    }

    public void setNday(LocalDate nday) {
        this.nday = nday;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
