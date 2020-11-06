package introdate;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee Employee = new Employee(1986, 8,2, "John Doe");
        System.out.println(Employee.getDateOfBirth());
        System.out.println(Employee.getBeginEmployment());
        System.out.println(Employee.getName());
        Employee.setName("Jack Doe");
        System.out.println(Employee.getName());

    }
}
