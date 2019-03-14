package com.thounghtworks.zjr_mark.utils;

import static com.thounghtworks.zjr_mark.utils.Printer.print;

import com.thounghtworks.zjr_mark.models.Talk;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TalksParser {
    private static final String LIGHTNING = "lightning";
    private static final Pattern PATTERN = Pattern.compile("^(\\D+)\\s*([0-9]+min|lightning)$");
    private static final String MIN = "min";

    public static ArrayList<Talk> parse(String path)  {
        ArrayList<Talk> list = new ArrayList<>();
        try {
            Files.lines(Paths.get(path)).forEach(talk -> {
                Matcher m = PATTERN.matcher(talk);
                if (m.find()) {
                    if (m.group(2).equals(LIGHTNING)) {
                        list.add(new Talk(m.group(0)+" ", "5"+MIN));
                    }else {
                        list.add(new Talk(m.group(1),m.group(2)));
                    }
                } else {
                    print("invalid format");
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        list.sort((o1, o2) -> o2.getDuration() - o1.getDuration());
        return list;
    }
}
