package Session_9_arrays.challenge;

public class Challenge4 {
    // 4. Given an array of 10 integers, count how many of them are even numbers and how many are odd.
    // Print out both counts.

    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10};

        int countEven = 0;
        int countOdd = 0;

        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;

            }
        }

        System.out.println("Even numbers: " + countEven + "/n" + "Odd numbers: " + countOdd);
    }
}
