package session_16_collection_framework.challenge.array_list;

import java.util.ArrayList;
import java.util.List;

public class challenge_3 {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");
        fruits.add("pear");

        fruits.add("pineapple");


        System.out.println("To insert an element into the array list at the first position: ");
        for (String fruit : fruits) {
            System.out.println(fruit + " ");
        }
    }
}
