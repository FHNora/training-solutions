package references;

public class ReferencesMain {
    public static void main(String[] args) {
     Person firstPerson;
     Person secondPerson;
     Person thirdPerson = new Person("John Doe", 47);
     firstPerson = thirdPerson;

    }
}
