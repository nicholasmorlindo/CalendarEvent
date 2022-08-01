package com.project.calendar.event.service;

import com.project.calendar.event.model.request.CalendarEventRequest;
import com.project.calendar.event.model.response.CalendarEventResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CalendarEventService {

    public List<CalendarEventResponse> createEvent (CalendarEventRequest request) {

        List<CalendarEventResponse> listEventCalendar = new ArrayList<>();
        int daysCount = 0;

        while (request.getInitDate().plusDays(daysCount).isBefore(request.getEndDate())
                || request.getInitDate().plusDays(daysCount).isEqual(request.getEndDate())) {
            CalendarEventResponse response = new CalendarEventResponse();
            response.setDate(request.getInitDate().plusDays(daysCount));
            response.setInitEventTime(request.getInitEventTime());
            response.setEndEventTime(request.getEndEventTime());
            listEventCalendar.add(response);
            daysCount++;
        }

        return listEventCalendar;
    }
}
