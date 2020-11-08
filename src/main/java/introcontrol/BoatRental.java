package introcontrol;

import java.util.Scanner;

public class BoatRental {
    public static void main(String[] args) {
        String boat1 = "Ötfős hajó";
        String boat2 = "Háromfős hajó";
        String boat3 = "Kétfős hajó";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hányan érkeztek?");
        int group = scanner.nextInt();
        if (group > 10){
            System.out.println("Az alábbi hajókat vitték el: " + boat1 + ", " + boat2 + ", " + boat3 + ", ennyi ember maradt a parton: " + (group - 10));
        }
        if (group <= 2){
            System.out.println("Az alábbi hajókat vitték el: " + boat3);
        }
        if (group == 3){
            System.out.println("Az alábbi hajókat vitték el: " + boat2);
        }
        if (group > 3 && group <= 5){
            System.out.println("Az alábbi hajókat vitték el: " + boat1);
        }
        if (group > 5 && group <= 7){
            System.out.println("Az alábbi hajókat vitték el: " + boat1 + ", " + boat3);
        }
        if (group == 8){
            System.out.println("Az alábbi hajókat vitték el: " + boat1 + ", " + boat2);
        }
        if (group > 8 && group <= 10){
            System.out.println("Az alábbi hajókat vitték el: " + boat1 + ", " + boat2 + ", " + boat3);
        }
    }
}
