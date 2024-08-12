package session_20.challenge.challenge_4;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNumbers {

    public static void main(String[] args) {
        List<Integer> primeNumbers = IntStream.iterate(101, n -> n + 1)
                .filter(PrimeNumbers::isPrime)
                .limit(10)
                .boxed()
                .collect(Collectors.toList());

        System.out.println("First 10 prime numbers greater than 100: " + primeNumbers);
    }

    private static boolean isPrime(int number) {
        if (number < 2) return false;
        return IntStream.rangeClosed(2, (int) Math.sqrt(number))
                .allMatch(n -> number % n != 0);
    }
}