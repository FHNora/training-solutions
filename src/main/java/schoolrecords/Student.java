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
        int sum = 0;
        int count = 0;
        double average;

        for (Mark a : marks) {
            sum += a;
            average = sum / count;
        }
        return average;
    }

    public double calculateSubjectAverage(Subject subject) {

    }

    public String getName() {
        return name;
    }

    public void grading(Mark mark) {
        marks.add(mark);
    }

    private boolean isEmpty(String name) {
        if (name == null || name == "") {
            return true;
        }
        return false;
    }

    public String toString(){
        return name.toString() + marks.toString();
    }

}
