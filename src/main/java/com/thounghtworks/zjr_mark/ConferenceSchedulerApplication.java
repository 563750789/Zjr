package com.thounghtworks.zjr_mark;

import com.thounghtworks.zjr_mark.models.Conference;
import com.thounghtworks.zjr_mark.models.Talk;
import com.thounghtworks.zjr_mark.utils.TalksParser;

import java.util.List;

public class ConferenceSchedulerApplication {

    public static void main(String[] args) {
            List<Talk> list = TalksParser.parse("talks.txt");
            Conference c = new Conference();
            c.scheduleTalks(list);
            c.outPut();
    }

}
