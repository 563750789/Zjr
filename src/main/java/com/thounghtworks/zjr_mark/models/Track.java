package com.thounghtworks.zjr_mark.models;

import static com.thounghtworks.zjr_mark.utils.Printer.print;

import java.time.LocalTime;

public class Track {

    private Session morningSession;
    private Session afternoonSession;

    public Track(){
        this.morningSession=new Session();
        this.morningSession.setDuration(180);
        this.morningSession.setBeginTime(LocalTime.of(9,00));
        this.morningSession.setEndTime(LocalTime.of(12,00));
        this.afternoonSession=new Session();
        this.afternoonSession.setDuration(240);
        this.afternoonSession.setBeginTime(LocalTime.of(13,00));
        this.afternoonSession.setEndTime(LocalTime.of(17,00));
    }

    public Session getMorningSession() {
        return morningSession;
    }

    public void setMorningSession(Session morningSession) {
        this.morningSession = morningSession;
    }

    public Session getAfternoonSession() {
        return afternoonSession;
    }

    public void setAfternoonSession(Session afternoonSession) {
        this.afternoonSession = afternoonSession;
    }

    public void outPut() {
        morningSession.outPut();
        print("12:00PM lauch");
        afternoonSession.outPut();
    }
}
