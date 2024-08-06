package session_19.challenge.challenge_3;

import java.util.stream.IntStream;
import java.util.List;

public class PrimeNumberFilter {
    public static void main(String[] args) {
        List<Integer> primeNumbers = IntStream.rangeClosed(1, 100)
                .filter(PrimeNumberFilter::isPrime)
                .boxed()
                .toList();

        System.out.println("Prime numbers from 1 to 100: " + primeNumbers);
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        return IntStream.rangeClosed(2, (int) Math.sqrt(number))
                .allMatch(n -> number % n != 0);
    }
}