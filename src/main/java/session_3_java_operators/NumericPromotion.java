package session_3_java_operators;

public class NumericPromotion {

    public static void main(String[] args) {
        short e = 10;
        int f = e + 5;

        long a = 10000000000L;

        //wrapper classes
        long maxLongValue = Long.MAX_VALUE;
        long minLongValue = Long.MIN_VALUE;

        System.out.println("Max long value: " + maxLongValue);
        System.out.println("Min long value: " + minLongValue);

    }
}
