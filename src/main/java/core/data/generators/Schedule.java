package core.data.generators;

import core.data.Group;
import core.data.Subject;

import java.util.ArrayList;
import java.util.List;

public class Schedule {
    List<Subject> subjects;
    List<Group> groups;
    List<ScheduleGroup> schedule = new ArrayList();
    //Integer[][] scheduleSubjectIndexes;

    public Schedule(List<Subject> subjects, List<Group> groups) {
        this.subjects = subjects;
        this.groups = groups;

        generateBaseSchedule();
    }

    private int getLengthAllSubjects() {
        int length = 0;
        for (int i = 0; i < subjects.size(); i++) {
            length += subjects.get(i).getLength();
        }
        return length;
    }

    private void generateBaseSchedule() {
        for (int i = 0; i < groups.size(); i++) {
            schedule.add(new ScheduleGroup(subjects));
        }
    }

    public void showBaseScheduleInConsole() {
        for (int i = 0; i < groups.size(); i++) {
            for (int j = 0; j < subjects.size(); j++) {
                System.out.printf("%s ",schedule.get(i).getScheduleGroup().get(j).getName());
            }
            System.out.println();
        }
    }
}
