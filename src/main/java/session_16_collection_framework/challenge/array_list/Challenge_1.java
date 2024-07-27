package session_16_collection_framework.challenge.array_list;

import java.util.ArrayList;
import java.util.List;

public class Challenge_1 {

    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("green");
        colors.add("yellow");

        for (String color : colors) {
            System.out.println(color + " ");
        }
    }
}