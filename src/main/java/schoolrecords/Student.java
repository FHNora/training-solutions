package schoolrecords;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private List<Mark> marks = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public double calculateAverage() {
        double count = 0;
        double average = 0;

        for (Mark d : marks) {
            if (d == marks) {
                count ++;
            }
        }
    }

    public double calculateSubjectAverage(Subject subject) {

    }

    public String getName() {
        return name;
    }

    public void grading(Mark mark) {

    }

    private boolean isEmpty(String name) {

    }

    public String toString(){

    }

}
