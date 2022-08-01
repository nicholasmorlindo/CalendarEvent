package com.project.calendar.event.controller;

import com.project.calendar.event.model.request.CalendarEventRequest;
import com.project.calendar.event.model.response.CalendarEventResponse;
import com.project.calendar.event.service.CalendarEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/calendar")
public class CalendarEventController {

    @Autowired
    private CalendarEventService calendarEventService;

    @PostMapping(value = "/create-event")
    public List<CalendarEventResponse> createEvent (CalendarEventRequest request) {
        List<CalendarEventResponse> listCalendarEventResponse = calendarEventService.createEvent(request);
        return listCalendarEventResponse;
    }

}
