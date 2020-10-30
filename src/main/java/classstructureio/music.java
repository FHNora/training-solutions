package classstructureio;

import java.util.Scanner;

public class music {
    public static void main(String[] args) {
        System.out.println("Mi a kedvenc zeneszáma?");
        System.out.println("Ki az előadó?");
        Scanner scanner = new Scanner(System.in);
        String band = scanner.nextLine();
        System.out.println("Mi a szám címe?");
        String title = scanner.nextLine();
        System.out.println("Milyen hosszú a szám?");
        int length = scanner.nextInt();
        System.out.println(band + "-" + title + " " + "(" +length + " " + "perc" + ")");
    }
}
