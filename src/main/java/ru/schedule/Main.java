package ru.schedule;

import core.data.Group;
import core.data.Subject;
import core.data.generators.Schedule;
import core.data.generators.ScheduleGroup;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Subject> subjects = new ArrayList<>();
        subjects.add(new Subject("Math",3));
        subjects.add(new Subject("Bio",5));
        subjects.add(new Subject("Literature",7));
        subjects.add(new Subject("English",4));
        subjects.add(new Subject("Informatics",2));

        ScheduleGroup shgr = new ScheduleGroup(subjects);
        shgr.showInConsole();

        List<Group> grops = new ArrayList<>();
        grops.add(new Group("501"));
        grops.add(new Group("502"));
        grops.add(new Group("503"));
        grops.add(new Group("504"));

        Schedule sch = new Schedule(subjects,grops);
        sch.showBaseScheduleInConsole();
    }
}