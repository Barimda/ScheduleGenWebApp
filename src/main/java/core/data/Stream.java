package core.data;

import java.util.List;

public class Stream {
    private List<Group> groups;

    public Stream(List<Group> groups) {
        this.groups = groups;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void addGroup(Group group){
        groups.add(group);
    }

}
