package stringmethods;

public class FileNameMain {

    public static void main(String[] args) {

        FileNameManipulator f = new FileNameManipulator();

        System.out.println(f.findLastCharacter("apple"));
        System.out.println(f.compareFilesByName("Hello", "Hy"));
        System.out.println(f.changeExtensionToLowerCase("WORLD"));
        System.out.println(f.replaceStringPart("Helicopter", "H", "V"));
    }
}
