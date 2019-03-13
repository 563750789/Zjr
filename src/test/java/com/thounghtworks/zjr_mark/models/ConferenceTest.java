package com.thounghtworks.zjr_mark.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;


import static org.junit.jupiter.api.Assertions.*;


class ConferenceTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private Conference conference;
    private Track track;
    private ArrayList<Talk> list;

    @BeforeEach
    public void setup() {
        conference = new Conference();
        track = new Track();
        list = new ArrayList<>();
        list.add(new Talk("a ", 30));
        list.add(new Talk("b ", 40));
        list.add(new Talk("c ", 50));
        list.add(new Talk("d ", 60));
        list.add(new Talk("e ", 70));
        list.add(new Talk("f ", 80));
        list.add(new Talk("g ", 90));

    }

    @Test
    //有问题
    public void scheduleTalks() {
//        System.setOut(new PrintStream(outContent));
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i).getDuration();
        }
        int days = sum % (180 + 240) == 0 ? sum / (180 + 240) : sum / (180 + 240) + 1;
        conference.scheduleTalks(list);
        assertEquals(days, conference.tracks.size());

    }

    @Test
    public void outPut() {
        track.getMorningSession().setTalks(list);
        track.getAfternoonSession().setTalks(list);
        conference.tracks.add(track);
        System.setOut(new PrintStream(outContent));
        conference.outPut();
        assertEquals("Track 1:" + System.lineSeparator() +
                "9:00AM a 30min" + System.lineSeparator() +
                "9:30AM b 40min" + System.lineSeparator() +
                "10:10AM c 50min" + System.lineSeparator() +
                "11:00AM d 60min" + System.lineSeparator() +
                "0:00PM e 70min" + System.lineSeparator() +
                "1:10PM f 80min" + System.lineSeparator() +
                "2:30PM g 90min" + System.lineSeparator() +
                "12:00PM lauch" + System.lineSeparator() +
                "1:00PM a 30min" + System.lineSeparator() +
                "1:30PM b 40min" + System.lineSeparator() +
                "2:10PM c 50min" + System.lineSeparator() +
                "3:00PM d 60min" + System.lineSeparator() +
                "4:00PM e 70min" + System.lineSeparator() +
                "5:10PM f 80min" + System.lineSeparator() +
                "6:30PM g 90min"+System.lineSeparator(), outContent.toString());
    }
}