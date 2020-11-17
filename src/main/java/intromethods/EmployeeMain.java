package intromethods;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee("John Doe",2001, 250_000);
        System.out.println(employee.getName());
        employee.setName("Jack Doe");
        System.out.println(employee.getName());
        System.out.println(employee.getHiringYear());
        System.out.println(employee.getSalary());
        employee.raiseSalary(100_000);
        System.out.println(employee.getSalary());

    }
}
