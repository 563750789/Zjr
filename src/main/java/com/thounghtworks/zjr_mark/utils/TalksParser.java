package com.thounghtworks.zjr_mark.utils;

import com.thounghtworks.zjr_mark.exception.ParseErrorException;
import com.thounghtworks.zjr_mark.models.Talk;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class TalksParser {



    public static ArrayList<Talk> parse(String url) throws FileNotFoundException, ParseErrorException {


        ArrayList<Talk> list = new ArrayList<>();
        BufferedReader reader = null;
        try {

            File file = new File(url);
            reader = new BufferedReader(new FileReader(file));
            String line = null;
            int numTime = 0;

            while ((line = reader.readLine()) != null) {

                String pattern = "(\\D*)(\\d+)(.*)";
                Pattern r = Pattern.compile(pattern);
                Matcher m = r.matcher(line);
                if (m.find()) {
                    list.add(new Talk(m.group(1), Integer.parseInt(m.group(2))));
                }

                else if (line.substring((line.lastIndexOf(" ")+1)).equals("lightning")){
                  list.add(new Talk(line+" ",5));
                }else {

                    throw new ParseErrorException();
                }
            }

            sort(list);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            close(reader);
        }
        return list;
    }


    public static void sort(ArrayList<Talk> list) {

        list.sort((o1, o2) -> o2.getDuration() - o1.getDuration());

    }


    public static void close(BufferedReader reader) {
        if (reader != null) {
            try {
                reader.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }

}
