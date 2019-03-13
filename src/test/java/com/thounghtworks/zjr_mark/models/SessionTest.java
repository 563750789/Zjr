package com.thounghtworks.zjr_mark.models;

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

    @BeforeEach
    public void setup() {
        session = new Session();
        ArrayList<Talk> list = new ArrayList<>();
        list.add(new Talk("gohome", 10));
        session.setTalks(list);
        session.setBeginTime(LocalTime.of(9, 0));
        session.setEndTime(LocalTime.of(12, 0));
    }

    @Test
    public void outPut() {
        System.setOut(new PrintStream(outContent));
        session.outPut();
        assertEquals("9:00AM gohome10min"+System.lineSeparator(),outContent.toString());
    }


}