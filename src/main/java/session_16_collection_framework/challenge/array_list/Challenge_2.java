package session_16_collection_framework.challenge.array_list;

import java.util.ArrayList;
import java.util.List;

public class Challenge_2 {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");
        fruits.add("pear");

        for (String fruit : fruits) {
            System.out.println(fruit + " ");
        }
    }
}
