package session_5_advanced_flow_control.challenge;

public class Problem3 {

    public static void main(String[] args) {
          /* 3.Counting Negative Numbers. Given an array of integers, write a program to count and print the number
        of negative integers in the array.*/
        int[] arrayNumber = {0, 7, 14, -5, -1, 4, -21, 0, -100, -2};
        counterNegativeNumber(arrayNumber);
    }

    private static void counterNegativeNumber(int[] arrayNumber) {
            int counterNegNumber = 0;

            for (int index = 0; index < arrayNumber.length; ++index) {
                if (arrayNumber[index] < 0) {
                    ++counterNegNumber;
                }
            }

            System.out.println("In the array are " + counterNegNumber + " negative number.");
        }
    }
    }
}
