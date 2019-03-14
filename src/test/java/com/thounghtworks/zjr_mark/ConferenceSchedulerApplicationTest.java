package com.thounghtworks.zjr_mark;

import static org.junit.jupiter.api.Assertions.*;

import com.thounghtworks.zjr_mark.models.Conference;
import com.thounghtworks.zjr_mark.models.Session;
import com.thounghtworks.zjr_mark.models.Talk;
import com.thounghtworks.zjr_mark.models.Track;
import com.thounghtworks.zjr_mark.utils.Printer;
import com.thounghtworks.zjr_mark.utils.TalksParser;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

class ConferenceSchedulerApplicationTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    private List<Talk> list = TestHelper.getTalkList();

    private Conference conference = new Conference();

    @Test
    public void main(){
        conference = new Conference();
        conference.scheduleTalks(list);
        System.setOut(new PrintStream(outContent));
        conference.outPut();
        assertEquals("Track 1:" +System.lineSeparator()+
                "09:00AM a5min" +System.lineSeparator()+
                "09:05AM b30min" +System.lineSeparator()+
                "09:35AM c45min" +System.lineSeparator()+
                "10:20AM d60min" +System.lineSeparator()+
                "12:00PM lauch"+System.lineSeparator(),outContent.toString());
    }
}