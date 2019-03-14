package com.thounghtworks.zjr_mark.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TrackTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Test
    public void constructionTest() {
        Track track = new Track();
        assertEquals(true,track.getAfternoonSession().getTalks().isEmpty());
    }

    @Test
    public void outPut() {
        Track track = new Track();
        ArrayList<Talk> list = new ArrayList<>();
        list.add(new Talk("gohome", 10));
        track.getMorningSession().setTalks(list);
        track.getAfternoonSession().setTalks(list);
        System.setOut(new PrintStream(outContent));
        track.outPut();
        assertEquals("09:00AM gohome10min" + System.lineSeparator() +
                "12:00PM lauch" + System.lineSeparator() +
                "01:00PM gohome10min" + System.lineSeparator(), outContent.toString());
    }
}