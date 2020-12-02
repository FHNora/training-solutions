package stringbasic;

public class Pet {

    private String name;
    private int yearOfBirth;
    private String gender;
    private String registrationNumber;

    public Pet(String name, int yearOfBirth, String gender, String registrationNumber){
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
        if (!gender.equals("male") || !gender.equals("female") || !gender.equals("unknown")){
            throw new IllegalArgumentException("Wrong gender");
        }
        this.registrationNumber = registrationNumber;
        if(registrationNumber.length() != 6){
            throw new IllegalArgumentException("Registration number contains 6 numbers");
        }
    }

    public String getName(){
        return name;
    }

    public int getYearOfBirth(){
        return yearOfBirth;
    }

    public String getGender(){
        return gender;
    }

    public String getRegistrationNumber(){
        return registrationNumber;
    }

}
