package lists;

import java.util.ArrayList;
import java.util.List;

public class Capsules {

    private ArrayList<String> colours;

    public void addLast(String capsule){
        colours.add(capsule);
    }

    public void addFirst(String capsule){
        colours.add(0,capsule);
    }

    public void removeFirst(){
        colours.remove(0);
    }

    public void removeLast(){
        colours.remove(colours.size() - 1);
    }

    public List<String> getColors(){
        return colours;
    }

    public static void main(String[] args) {
       Capsules capsules = new Capsules();
       capsules.addFirst("red");
        System.out.println(capsules.getColors());

        capsules.addFirst("green");
        System.out.println(capsules.getColors());

        capsules.addLast("yellow");
        System.out.println(capsules.getColors());

        capsules.removeFirst();
        System.out.println(capsules.getColors());

        capsules.removeLast();
        System.out.println(capsules.getColors());
    }
}
