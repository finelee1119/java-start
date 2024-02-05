package casting;

public class Casting1 {
    public static void main(String[] args) {
        // int < long < double

        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue;
        System.out.println("longValue = " + longValue); // 10

        doubleValue = intValue;
        System.out.println("doubleValue1 = " + doubleValue); // 10.0

        doubleValue = 20L;
        System.out.println("doubleValue2 = " + doubleValue); // 20.0
    }
}
