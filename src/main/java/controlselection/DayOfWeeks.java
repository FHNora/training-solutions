package controlselection;


public class DayOfWeeks {
    public String getNameOfDays(String day){
        String message;
        switch (day){
            case "Hétfő":
            case "hétfő":
                message ="hét eleje";
                break;
            case "Kedd":
            case "kedd":
            case "Szerda":
            case "szerda":
            case "Csütörtök":
            case "csütörtök":
                message ="hét közepe";
                break;
            case "Péntek":
            case "péntek":
                message ="majdnem hétvége";
                break;
            case "Szombat":
            case "szombat":
            case "Vasárnap":
            case "vasárnap":
                message ="hét vége";
                break;
        }
        return "";
    }

    public static void main(String[] args) {
        DayOfWeeks dayOfWeeks = new DayOfWeeks();
        System.out.println(dayOfWeeks.getNameOfDays("kedd"));
    }
}
