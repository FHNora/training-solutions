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
        double sum = 0;

        for (Mark a : marks) {
            sum += a.getMarkType().getValue();
        }
        return Math.round((sum / marks.size()) * 100.0) / 100.0;
    }

    public double calculateSubjectAverage(Subject subject) {
        double sum = 0;
        int count = 0;

        for (Mark s : marks) {
            if (s.getSubject().getSubjectName().equals(subject.getSubjectName())) {
                sum += s.getMarkType().getValue();
                count ++;
            }
        }
        return Math.round((sum / count) * 100.0) / 100.0;
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
        String data = name + "marks: ";
        for (Mark s : marks) {
            data += s.getSubject().getSubjectName() + ": " + s.toString() + " ";
        }
        return data.trim();
    }

}
