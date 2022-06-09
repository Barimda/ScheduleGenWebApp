package core.data;


public class Subject {
    String name;
    Integer Length = 1;

    public Subject(String name, Integer length) {
        this.name = name;
        Length = length;
    }

    public String getName() {
        return name;
    }

    public Integer getLength() {
        return Length;
    }
}
