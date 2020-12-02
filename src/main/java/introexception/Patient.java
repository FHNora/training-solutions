package introexception;

public class Patient {
    private String name;
    private String socialSecurityNumber;
    private int yearOfBirth;

    public Patient (String name, String socialSecurityNumber, int yearOfBirth){

        if (name == null || name.equals("")){
          throw new IllegalArgumentException("Name is not given");
        }
        if (yearOfBirth < 1900){
            throw new IllegalArgumentException("Year of Birth should be more than 1990");
        }
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName(){
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public int getYearOfBirth(){
        return yearOfBirth;
    }
}
