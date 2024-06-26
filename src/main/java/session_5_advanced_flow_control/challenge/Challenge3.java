package session_5_advanced_flow_control.challenge;

public class Challenge3 {

    public static void main(String[] args) {
        int[] arrayNumber = {-1, 2, -3, 4, 0, -5};
        int count = countNegativeNumbers(arrayNumber);
        System.out.println("Number of negative numbers in the array: " + count);
    }

    public static int countNegativeNumbers(int[] arrayNumber) {
        int count = 0;
        for (int index = 0; index < arrayNumber.length; index++) {
            if (arrayNumber[index] < 0) {
                count++;
            }
        }
        return count;
    }
}
