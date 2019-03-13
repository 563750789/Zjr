package com.thounghtworks.zjr_mark.models;

import com.thounghtworks.zjr_mark.utils.Printer;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

//会话实体类(上下午类)
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

        talks.stream().forEach(talk -> {
            Printer.print(Printer.timeParser(beginTime.getHour(), beginTime.getMinute()) + talk.getTitle() + talk.getTime());
            beginTime = beginTime.plusMinutes(talk.getDuration());
        });

    }
}
