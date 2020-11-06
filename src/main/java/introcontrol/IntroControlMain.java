package introcontrol;

public class IntroControlMain {
    public static void main(String[] args) {
        IntroControl introControl = new IntroControl();
        System.out.println(introControl.substractTenIfGreaterThenTen(7));
        System.out.println(introControl.describeNumber(0));
        System.out.println(introControl.greetingJoe("Jane"));
        System.out.println(introControl.calculateBonus(2000000));
        introControl.printNumbers(5);
        introControl.printNumbersBetween(3,6);
    }
}
