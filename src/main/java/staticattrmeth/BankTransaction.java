package staticattrmeth;


public class BankTransaction {

    private static int currentMinValue;
    private static int currentMaxValue;

    public static int getCurrentMinValue() {
        return currentMinValue;
    }

    public static int getCurrentMaxValue() {
        return currentMaxValue;
    }
}
