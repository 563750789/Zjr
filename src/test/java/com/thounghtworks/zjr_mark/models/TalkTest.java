package com.thounghtworks.zjr_mark.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TalkTest {

    @Test
    public void constructorTest1() {
        Talk talk = new Talk("a", 2);
        assertEquals("a", talk.getTitle());
        assertEquals(2, talk.getDuration());
    }

    @Test
    public void constructorTest2() {
        Talk talk = new Talk("a", "2min");
        assertEquals("a", talk.getTitle());
        assertEquals(2, talk.getDuration());
    }

    @Test
    public void setDurationStr() {
        Talk talk = new Talk();
        talk.setDurationStr("5min");
        assertEquals(5,talk.getDuration());
    }

    @Test
    public void getDurationStr(){
        Talk talk = new Talk("a", 2);
        assertEquals("2min",talk.getDurationStr());
    }


}