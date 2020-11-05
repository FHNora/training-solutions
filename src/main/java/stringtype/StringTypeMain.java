package stringtype;

public class StringTypeMain {
    public static void main(String[] args) {
        String prefix = "Hello ";
        String name = "John Doe";
        String message = prefix + name;
        int a = 444;
        message = message + a;
        System.out.println(message);
        boolean b = message.equals("Hello John Doe");
        System.out.println(b);
        boolean c = message.equals("Hello John Doe444");
        System.out.println(c);
        String k = "";
        String l = "";
        String m = k + l;
        System.out.println(m);
        System.out.println(m.length());
        String z = "Abcde";
        System.out.println(z.length());
        System.out.println(z.substring(0, 1) + "," + z.substring(2,3));

    }
}
