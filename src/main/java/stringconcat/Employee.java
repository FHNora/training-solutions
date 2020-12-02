package stringconcat;

public class Employee {
    private String name;
    private String job;
    private int salary;

    public Employee(String name, String job, int salary){
        this.name = name;
        if (name.equals(null) || name.equals("")){
            throw new IllegalArgumentException("Name should be given");
        }
        this.job = job;
        if (job.equals(null) || job.equals("")){
            throw new IllegalArgumentException("Job should be given");
        }
        this.salary = salary;
        if (salary %1000 != 0){
            throw new IllegalArgumentException("Wrong amount");
        }

    }

    public String toString(String name, String job, int salary){
        return name + " - " + job + " - " + salary + " Ft";
    }
}
