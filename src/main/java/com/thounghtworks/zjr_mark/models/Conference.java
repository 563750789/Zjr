package com.thounghtworks.zjr_mark.models;

import com.thounghtworks.zjr_mark.utils.Printer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Conference {

    List<Track> tracks;

    public Conference() {

        this.tracks = new ArrayList<Track>();

    }

    public void scheduleTalks(ArrayList<Talk> list) {

        while (list.size() > 0) {
            Track track = new Track();
            Iterator<Talk> iterator = list.iterator();
            while (iterator.hasNext()) {
                Talk talk = iterator.next();

                if (track.getMorningSession().getDuration() >= talk.getDuration()) {
                    track.getMorningSession().getTalks().add(talk);
                    track.getMorningSession().setDuration(
                            track.getMorningSession().getDuration() - talk.getDuration());
                    iterator.remove();
                } else if (track.getAfternoonSession().getDuration() >= talk.getDuration()) {
                    track.getAfternoonSession().getTalks().add(talk);
                    track.getAfternoonSession().setDuration(
                            track.getAfternoonSession().getDuration() - talk.getDuration());
                    iterator.remove();
                }
            }
            if (track.getAfternoonSession().getDuration() <= 60) {
                track.getAfternoonSession().getTalks().add(new Talk("Networking Event", 0));
            }
            this.tracks.add(track);
        }

    }


    public void outPut() {



        for (int i = 0; i < tracks.size(); i++) {
            int k = i + 1;
            Printer.print("Track " + k + ":");
            tracks.get(i).outPut();
        }

    }


}
