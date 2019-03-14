package com.thounghtworks.zjr_mark.models;
import static org.junit.jupiter.api.Assertions.*;
import com.thounghtworks.zjr_mark.TestHelper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

class ConferenceTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private Conference conference;
    private Track track;
    private ArrayList<Talk> list;

    @BeforeEach
    public void setup() {
        conference = new Conference();
        track = new Track();
        list = TestHelper.getTalkList();
    }

    @Test
    //有问题
    public void scheduleTalks() {
        conference.scheduleTalks(list);
        assertEquals(false,conference.tracks.get(0).getMorningSession().getTalks().isEmpty());
        assertEquals(1,conference.tracks.size());
        assertEquals("b",conference.tracks.get(0).getMorningSession().getTalks().get(1).getTitle());
    }

    @Test
    public void outPut() {
        track.getMorningSession().setTalks(list);
        track.getAfternoonSession().setTalks(list);
        conference.tracks.add(track);
        System.setOut(new PrintStream(outContent));
        conference.outPut();
        assertEquals("Track 1:" + System.lineSeparator() +
                "09:00AM a5min" + System.lineSeparator() +
                "09:05AM b30min" + System.lineSeparator() +
                "09:35AM c45min" + System.lineSeparator() +
                "10:20AM d60min" + System.lineSeparator() +
                "12:00PM lauch" + System.lineSeparator() +
                "01:00PM a5min" + System.lineSeparator() +
                "01:05PM b30min" + System.lineSeparator() +
                "01:35PM c45min" + System.lineSeparator() +
                "02:20PM d60min" + System.lineSeparator(), outContent.toString());
    }
}