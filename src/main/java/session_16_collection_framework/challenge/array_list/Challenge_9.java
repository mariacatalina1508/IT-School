package session_16_collection_framework.challenge.array_list;

import java.util.ArrayList;
import java.util.Collections;

public class Challenge_9 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Cherry");
        list1.add("Date");

        System.out.println("Original ArrayList: " + list1);

        ArrayList<String> list2 = new ArrayList<>();
        list2.addAll(list1);

        System.out.println("Copied ArrayList using addAll: " + list2);

        ArrayList<String> list3 = new ArrayList<>(Collections.nCopies(list1.size(), ""));
        Collections.copy(list3, list1);

        System.out.println("Copied ArrayList using Collections.copy: " + list3);
    }
}