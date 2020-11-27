package controlselection;

public class Greetings {
   public void Greeting(int hour, int minute){

      if (hour > 5 && hour < 9){
         System.out.println("Jó reggelt!");
      }
      if (hour >= 9 && (hour <= 18 && minute <= 29)){
         System.out.println("Jó napot!");
      }
      if ((hour >= 18 && minute > 30) && hour < 21){
         System.out.println("Jó estét!");
      }
      else System.out.println("Jó éjt");
      }
}
