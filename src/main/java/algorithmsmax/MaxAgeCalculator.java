package algorithmsmax;

import java.util.ArrayList;
import java.util.List;

public class MaxAgeCalculator {

    public static Trainer trainerWithMaxAge(List<Trainer> trainers) {
        Trainer trainer;
        int max = 0;
        for (Trainer tr : trainers) {
            if (tr.getAge() > max) {
                max = tr.getAge();
                trainer = ;
            }
        }
        return trainer;
    }

    public static void main(String[] args) {
        List<Trainer> trainers = new ArrayList<>();
        Trainer trainer1 = new Trainer("John", 39);
        Trainer trainer2 = new Trainer("Jack", 31);
        Trainer trainer3 = new Trainer("Kate", 26);
        Trainer trainer4 = new Trainer("Sarah", 44);
        Trainer trainer5 = new Trainer("Jane", 28);

        System.out.println(trainerWithMaxAge(trainers));

    }
}
