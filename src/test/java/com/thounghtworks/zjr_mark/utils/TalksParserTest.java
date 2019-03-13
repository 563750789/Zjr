package com.thounghtworks.zjr_mark.utils;

import com.thounghtworks.zjr_mark.exception.ParseErrorException;
import com.thounghtworks.zjr_mark.models.Talk;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TalksParserTest {

    private String url = "src/main/resources/talks-list.txt";

    @Test
    void parse() throws FileNotFoundException, ParseErrorException {

        ArrayList<Talk> list = TalksParser.parse(url);
        int j;
        for (int i = 0; i < list.size(); i++) {
            j = i >= (list.size() - 1) ? i : i + 1;
            if (list.get(i).getTitle().endsWith("lightning")) {
                assertEquals(5, list.get(i).getDuration());
            }
            //是否按照duration从大到小排列
            if (list.get(i).getDuration() < list.get(j).getDuration()) {
                assertFalse(true);
            }
        }

    }

    @Test
    void sort() {
        ArrayList<Talk> list = new ArrayList<>();
        list.add(new Talk("a", 20));
        list.add(new Talk("b", 10));
        list.add(new Talk("c", 30));
        TalksParser.sort(list);

        ArrayList<Talk> list1 = new ArrayList<>();
        list1.add(new Talk("c", 30));
        list1.add(new Talk("a", 20));
        list1.add(new Talk("b", 10));

        for (int i = 0; i < list.size(); i++) {
            assertEquals(list1.get(i).getTitle(), list.get(i).getTitle());
        }

    }


    @Test
    //有问题
    void close() throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(new File("src/main/resources/talks-list.txt")));
        TalksParser.close(br);

    }
}