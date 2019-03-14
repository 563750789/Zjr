package com.thounghtworks.zjr_mark.models;

import static com.thounghtworks.zjr_mark.utils.Printer.print;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Session {

    private List<Talk> talks;
    private LocalTime beginTime;
    private LocalTime endTime;
    private Integer duration;

    public Session() {
        this.talks = new ArrayList<>();
    }

    public List<Talk> getTalks() {
        return talks;
    }

    public void setTalks(List<Talk> talks) {
        this.talks = talks;
    }

    public LocalTime getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(LocalTime beginTime) {
        this.beginTime = beginTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public void outPut() {
        LocalTime time = beginTime;
        for (Talk talk : talks) {
            if (time.getHour() < 12) {
                print(time.format(DateTimeFormatter.ofPattern("hh:mm")) + "AM" + " " + talk.getTitle() + talk.getDurationStr());
            } else {
                print(time.format(DateTimeFormatter.ofPattern("hh:mm")) + "PM" + " " + talk.getTitle() + talk.getDurationStr());
            }
            time = time.plusMinutes(talk.getDuration());
        }
    }
}
