package core.math.genethic;

import core.data.Subject;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Methods {
    public static List shake(List list) {
        List<Subject> memory = new ArrayList<>();
        memory.addAll(list);
        Random rand = new Random();
        for (int i = 0; i < list.size(); i++) {
            int index = rand.nextInt(memory.size());
            list.set(i, memory.get(index));
            memory.remove(index);
        }
        return list;
    }
}
