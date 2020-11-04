package statements;

public class statementMain {
    public static void main(String[] args) {
        int x;
        x = 5 + 6;
        System.out.println(x);
        int y;
        y = 11 - x;
        System.out.println(y);
        int z;
        z = 8;
        System.out.println(z);
        boolean b = false;

        if (x > y) {
            b = true;
        }
        System.out.println(b);

        boolean c = false;

        if (b = true || z > 5){
            c = true;
        }
        System.out.println(c);

        z++;
        System.out.println(z);
    }
}
