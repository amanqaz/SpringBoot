package com.Geester.EventManagment.Model;

import org.springframework.stereotype.Component;

import java.sql.Time;
import java.util.Date;

@Component

public class eventInfo {
    private  int eventId;

    private   String eventName;
    private String locationOfEvent;
    private String date = "02-05-2023";
    private String startTime= "09:00:00";
    private  String endTIme = "12:00:00";

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getLocationOfEvent() {
        return locationOfEvent;
    }

    public void setLocationOfEvent(String locationOfEvent) {
        this.locationOfEvent = locationOfEvent;
    }

    public String getDate() {
        return date;
    }

    public String getStartTime() {
        return startTime;
    }



    public String getEndTIme() {
        return endTIme;
    }




}
