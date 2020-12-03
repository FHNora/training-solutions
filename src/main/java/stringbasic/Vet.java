package stringbasic;

import java.util.ArrayList;
import java.util.List;

public class Vet {
    List<String> pets = new ArrayList<>();
    Pet pet = new Pet("Zorro", 2017,"male", "487521");

    public List<Pet> add(Pet pet, List<Pet> pets){
        for (Pet p : pets){
            if (!areEquals(p, pet)){
                pets.add(pet);
            }
        }
        return pets;
    }

    public boolean areEquals(Pet pet, Pet pet2){
       return pet.getRegistrationNumber().equals(pet2.getRegistrationNumber());
    }

    public List<String> getPets() {

        return pets;
    }
}
