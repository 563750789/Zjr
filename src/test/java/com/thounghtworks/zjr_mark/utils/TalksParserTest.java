package com.thounghtworks.zjr_mark.utils;
import com.thounghtworks.zjr_mark.models.Talk;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TalksParserTest {

    private String path = "talks.txt";

    @Test
    public void parse() {
        ArrayList<Talk> list = TalksParser.parse(path);
        int j;
        for (int i = 0; i < list.size(); i++) {
            j = i >= (list.size() - 1) ? i : i + 1;
            if (list.get(i).getTitle().endsWith("lightning")) {
                assertEquals(5, list.get(i).getDuration());
            }
            if (list.get(i).getDuration() < list.get(j).getDuration()) {
                assertFalse(true);
            }
        }
    }
}