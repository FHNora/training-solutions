package schoolrecords;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassRecords {

    private String className;
    private Random rnd;
    private List<Student> students = new ArrayList<>();

    public ClassRecords(String className, Random rnd) {
        this.className = className;
        this.rnd = rnd;
    }


    public boolean addStudent(Student student) {
        students.add(student);
        return true;
    }

    public double calculateClassAverage() {

    }

    public double calculateClassAverageBySubject(Subject subject) {

    }

    public Student findStudentByName(String name) {

    }

    public String getClassName() {
        return className;
    }

    private boolean isEmpty(String className) {

    }

    private String listStudentNames() {

    }

    public List<StudyResultByName> listStudyResults() {

    }

    public boolean removeStudent(Student student) {
        students.remove(student);
        return true;
    }

    public Student repetition() {

    }

}
