package com.thounghtworks.zjr_mark;

import com.thounghtworks.zjr_mark.exception.ParseErrorException;
import com.thounghtworks.zjr_mark.models.Conference;
import com.thounghtworks.zjr_mark.models.Talk;
import com.thounghtworks.zjr_mark.utils.Printer;
import com.thounghtworks.zjr_mark.utils.TalksParser;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ConferenceSchedulerApplication {

    public static void main(String[] args) {

        try {
            //使用工具类将txt文本解析
            ArrayList<Talk> list = TalksParser.parse("src/main/resources/talks-list.txt");

            Conference c = new Conference();

            c.scheduleTalks(list);

            c.outPut();

        } catch (FileNotFoundException e) {
            Printer.print("Sorry,the talks file not exist!");
        } catch (ParseErrorException e) {
            Printer.print("Sorry,the content format is invalid!");
        }

    }

}
