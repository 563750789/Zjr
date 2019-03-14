package com.thounghtworks.zjr_mark;

import com.thounghtworks.zjr_mark.models.Session;
import com.thounghtworks.zjr_mark.models.Talk;
import com.thounghtworks.zjr_mark.models.Track;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class TestHelper {

    private static ArrayList<Talk> talkList = new ArrayList<>();
    private static Session session = new Session();
    private static ArrayList<Track> trackList = new ArrayList<>();

    static {
        talkList.add(new Talk("a", 5));
        talkList.add(new Talk("b", 30));
        talkList.add(new Talk("c", 45));
        talkList.add(new Talk("d", 60));

        session.setTalks(talkList);
        session.setBeginTime(LocalTime.of(9, 0));
        session.setEndTime(LocalTime.of(12, 0));
        session.setDuration(180);

        Track track = new Track();
        track.setMorningSession(session);
        trackList.add(track);
    }

    public static ArrayList<Talk> getTalkList() {
        return talkList;
    }

    public static Session getSession() {
        return session;
    }




}
