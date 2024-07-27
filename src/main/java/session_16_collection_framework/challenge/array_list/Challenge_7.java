package session_16_collection_framework.challenge.array_list;

import java.util.ArrayList;
import java.util.List;

public class Challenge_7 {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");
        fruits.add("pear");

        findFruit(fruits, "APPLE");
    }

    public static void findFruit(List<String> fruits, String fruitToFind) {
        if (fruits.contains(fruitToFind.toLowerCase())) {
            System.out.println("Find fruit.");
        } else {
            System.out.println("Don't find fruit.");
        }
    }
}