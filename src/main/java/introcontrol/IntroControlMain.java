package introcontrol;

public class IntroControlMain {
    public static void main(String[] args) {
        IntroControl introControl = new IntroControl();
        System.out.println(introControl.substractTenIfGreaterThenTen(7));
        System.out.println(introControl.describeNumber(0));
        System.out.println(introControl.greetingJoe("Jane"));
        System.out.println(introControl.calculateBonus(2000000));
        System.out.println(" ");
        System.out.println(introControl.calculateConsumption(10,2));
        System.out.println(" ");
        introControl.printNumbers(5);
        System.out.println(" ");
        introControl.printNumbersBetween(3,6);
        System.out.println(" ");
        introControl.printNumbersBetweenAnyDirection(4, 8);
        System.out.println(" ");
        introControl.printNumbersBetweenAnyDirection(4, 1);
        System.out.println(" ");
        introControl.printOddNumbers(17);
    }
}
