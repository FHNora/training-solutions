package arrays;

public class ArrayHandler {
    public static boolean contains(int[] source, int itemToFind) {
        for (int i = 0; i < source.length; i++) {
            if (source[i] == itemToFind) return true;
        }
        return false;
    }

    public static int find(int[] source, int itemToFind){
        for (int i = 0; i < source.length; i++){
            if (source[i] == itemToFind) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] source = {1,2,4,5,6,7,9};
        System.out.println(contains(source, 7));
        System.out.println(find(source, 4));
    }
}

