package com.thounghtworks.zjr_mark.models;


public class Talk {

    private String title;
    private Integer duration;
    private static final String MIN ="min";

    public Talk() {
    }

    public Talk(String title, String duration) {
        this.title = title;
        setDurationStr(duration);
    }
    public Talk(String title, Integer duration) {
        this.title = title;
        this.duration=duration;
    }

    public String getTitle() {
        return title;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDurationStr(String durationStr) {
        int lastIndexOf = durationStr.lastIndexOf("m");
        String s = durationStr.substring(0, lastIndexOf);
        this.duration = Integer.parseInt(s);
    }

    public String getDurationStr() {
        return duration == 0 ? "" : Integer.toString(duration) + MIN;
    }



}
