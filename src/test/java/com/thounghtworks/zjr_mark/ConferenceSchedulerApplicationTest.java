package com.thounghtworks.zjr_mark;

import com.thounghtworks.zjr_mark.models.Talk;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import java.util.ArrayList;


class ConferenceSchedulerApplicationTest {
    //有问题
    @Test
    public void main() throws Exception {

        ArrayList<Talk> list1 = new ArrayList<>();
        list1.add(new Talk("a",10));
        list1.add(new Talk("b",20));
        list1.add(new Talk("c",30));
        list1.add(new Talk("d",40));
        list1.add(new Talk("e",50));
        list1.add(new Talk("f",60));
        list1.add(new Talk("g",70));
        list1.add(new Talk("h",80));
    }
}