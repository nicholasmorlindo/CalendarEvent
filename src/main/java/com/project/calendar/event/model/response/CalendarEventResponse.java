package com.project.calendar.event.model.response;

import java.time.LocalDate;
import java.time.LocalTime;

public class CalendarEventResponse {

    private LocalDate date;
    private LocalTime initEventTime;
    private LocalTime endEventTime;

    public CalendarEventResponse(){
    }

    public CalendarEventResponse(LocalDate date, LocalTime initEventTime, LocalTime endEventTime) {
        this.date = date;
        this.initEventTime = initEventTime;
        this.endEventTime = endEventTime;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getInitEventTime() {
        return initEventTime;
    }

    public void setInitEventTime(LocalTime initEventTime) {
        this.initEventTime = initEventTime;
    }

    public LocalTime getEndEventTime() {
        return endEventTime;
    }

    public void setEndEventTime(LocalTime endEventTime) {
        this.endEventTime = endEventTime;
    }
}
