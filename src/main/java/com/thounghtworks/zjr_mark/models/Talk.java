package com.thounghtworks.zjr_mark.models;


import com.thounghtworks.zjr_mark.exception.OutOfSessionDurationError;

//事件实体类
public class Talk {

    private String title;

    private Integer duration;

    public Talk() {
    }

    public Talk(String title, Integer duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) throws OutOfSessionDurationError {
        if (duration>240){
            throw new OutOfSessionDurationError();
        }
        this.duration = duration;
    }

    public String getTime() {

        return duration==0?"":Integer.toString(duration)+"min";
    }

}
