package com.thounghtworks.zjr_mark.models;

import com.thounghtworks.zjr_mark.TestHelper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalTime;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SessionTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private Session session;

    @Test
    public void constructorTest(){
        Session s = new Session();
        assertEquals(true,s.getTalks().isEmpty());
    }

    @Test
    public void outPut() {
        session = TestHelper.getSession();
        System.setOut(new PrintStream(outContent));
        session.outPut();
        assertEquals("09:00AM a5min"+System.lineSeparator()+
        "09:05AM b30min"+System.lineSeparator()+
        "09:35AM c45min"+System.lineSeparator()+
        "10:20AM d60min"+System.lineSeparator(),outContent.toString());
    }


}