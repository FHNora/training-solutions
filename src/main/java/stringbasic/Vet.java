package stringbasic;

import java.util.ArrayList;
import java.util.List;

public class Vet {
    List<String> pets = new ArrayList<>();
    Pet pet = new Pet("Zorro", 2017,"male", "487521");

    public List<String> add(String pet, List<String> pets){
        for (String p : pets){
            if (!areEquals(p, pet)){
                pets.add(pet);
            }
        }
        return pets;
    }

    public boolean areEquals(String pet, String pet2){
        if (pet){
            return true;
        }
        return false;
    }

    public List<String> getPets() {
        return pets;
    }
}
