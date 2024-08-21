package session_20.challenge.challenge_5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VowelCounter {

    public static void main(String[] args) {
        Map<Character, Integer> vowelCountMap = new HashMap<>();
        vowelCountMap.put('a', 0);
        vowelCountMap.put('e', 0);
        vowelCountMap.put('i', 0);
        vowelCountMap.put('o', 0);
        vowelCountMap.put('u', 0);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine().toLowerCase();

        int totalVowels = 0;
        for(char ch : input.toCharArray()) {
            if(vowelCountMap.containsKey(ch)) {
                vowelCountMap.put(ch, vowelCountMap.get(ch) +1);
                totalVowels++;
            }
        }
        System.out.println("Vowel count: ");
        for(Map.Entry<Character, Integer> entry : vowelCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("Total number of vowels: " + totalVowels);
    }
}