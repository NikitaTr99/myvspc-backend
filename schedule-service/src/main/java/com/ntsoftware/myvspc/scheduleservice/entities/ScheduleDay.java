package com.ntsoftware.myvspc.scheduleservice.entities;

import java.util.ArrayList;
import java.util.Collection;

public class ScheduleDay {

    private Collection<ScheduleLesson> lessons;

    private int tag;

    public ScheduleDay(int tag) {
        this.tag = tag;
        lessons = new ArrayList<>();
    }

    public void addLesson(ScheduleLesson l) {
        lessons.add(l);
    }

    public int getTag() {
        return tag;
    }

    public void setTag(int tag) {
        this.tag = tag;
    }

    public Collection<ScheduleLesson> getLessons() {
        return lessons;
    }

    public void setLessons(Collection<ScheduleLesson> lessons) {
        this.lessons = lessons;
    }
}
