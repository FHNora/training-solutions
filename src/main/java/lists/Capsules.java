package lists;

import java.util.ArrayList;
import java.util.List;

public class Capsules {

    private ArrayList<String> colours;

    public Capsules(){
        colours = new ArrayList<>();
    }

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

}
