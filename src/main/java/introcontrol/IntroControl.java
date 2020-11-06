package introcontrol;

public class IntroControl {
    public int substractTenIfGreaterThenTen(int number){
        if (number <= 10){
            return number;
        }
        else return number - 10;
    }

    public String describeNumber(int number){
        if (number == 0){
            return "zero";
        }
        else return "not zero";
    }

    public String greetingJoe(String name){
        if (name.equals("Joe")){
            return "Hello Joe";
        }
        else return "";
    }

    public int calculateBonus(int sale){
        if (sale > 1_000_000){
            return (sale / 100) * 10;
        }
        else return 0;
    }

   public void printNumbers(int max){
        for (int i = 0; i <= max; i++){
            System.out.println(i);
        }
   }

   public void printNumbersBetween(int min, int max){
        for (int i = 0; i <=max; i++){
            if (i >= min && i <= max){
                System.out.println(i);
            }
        }
   }

   public void printNumbersBetweenAnyDirection(int a, int b){
        for (int i = 0; i < 100; i++){
            if (a > b) {
                System.out.println(i);
            }
        }
        for (int i = 0; i <100; i--){
            if (b > a){
                System.out.println(i);
            }
        }
   }
}
