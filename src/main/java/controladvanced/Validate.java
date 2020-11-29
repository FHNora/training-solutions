package controladvanced;

import java.util.ArrayList;
import java.util.List;

public class Validate {

    public List<String> filterLines(List<String> lines) {
        List<String> validLines = new ArrayList<>();
        for (String line : lines) {
            String[] parts = line.split(";");
            if(parts.length != 4){
                return null;
            }
        }
    }
}
