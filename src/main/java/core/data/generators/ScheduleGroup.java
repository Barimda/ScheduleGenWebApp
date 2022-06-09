package core.data.generators;

import core.data.Subject;
import core.math.genethic.Methods;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ScheduleGroup {
    List<Subject> subjects;

    public ScheduleGroup(List<Subject> subjects) {
        this.subjects = subjects;
        generate();
    }

    private void generate() {
        subjects = Methods.shake(subjects);
    }

    public List<Subject> getScheduleGroup(){
        return subjects;
    }

    public void showInConsole(){
        for (int i = 0; i < subjects.size(); i++) {
            System.out.printf("%s %d\n",subjects.get(i).getName(),subjects.get(i).getLength());
        }
    }
}
