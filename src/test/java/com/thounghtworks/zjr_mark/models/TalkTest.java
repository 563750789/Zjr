package com.thounghtworks.zjr_mark.models;

import com.thounghtworks.zjr_mark.exception.OutOfSessionDurationError;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TalkTest {

    @Test
    public void setDuration() {
        Talk talk = new Talk("a", 60);
        assertEquals(60,talk.getDuration());

        assertThrows(OutOfSessionDurationError.class, () -> talk.setDuration(250));
    }

    @Test
    public void getTime() {

        Talk talk = new Talk("a", 60);
        assertEquals("60min",talk.getTime());

    }
}