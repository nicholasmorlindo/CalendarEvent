package com.project.calendar.event.model.request;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.FutureOrPresent;
import java.time.LocalDate;
import java.time.LocalTime;

public class CalendarEventRequest {

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @FutureOrPresent
    private LocalDate initDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate endDate;

    @DateTimeFormat(pattern = "HH:mm:ss")
    private LocalTime initEventTime;

    @DateTimeFormat(pattern = "HH:mm:ss")
    private LocalTime endEventTime;

    private String EventDescription;

    public CalendarEventRequest(LocalDate initDate, LocalDate endDate, LocalTime initEventTime, LocalTime endEventTime, String eventDescription) {
        this.initDate = initDate;
        this.endDate = endDate;
        this.initEventTime = initEventTime;
        this.endEventTime = endEventTime;
        EventDescription = eventDescription;
    }

    public LocalDate getInitDate() {
        return initDate;
    }

    public void setInitDate(LocalDate initDate) {
        this.initDate = initDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
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

    public String getEventDescription() {
        return EventDescription;
    }

    public void setEventDescription(String eventDescription) {
        EventDescription = eventDescription;
    }
}
