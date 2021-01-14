package staticattrmeth;


import java.math.BigDecimal;

public class BankTransaction {

    private static int currentMinValue;
    private static int currentMaxValue;

    public static int getCurrentMinValue() {
        return currentMinValue;
    }

    public static int getCurrentMaxValue() {
        return currentMaxValue;
    }

    public static void initTheDay() {

    }

    public static BigDecimal averageOfTransaction() {
        
    }
}
