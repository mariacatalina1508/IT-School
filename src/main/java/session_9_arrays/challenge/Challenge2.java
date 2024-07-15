package session_9_arrays.challenge;

import java.util.ArrayList;

public class Challenge2 {
    // 2. Create a wishlist for christmas with ArrayList and print the values

    public static void main(String[] args) {
        ArrayList<String> christmasWishList = new ArrayList<>();
        christmasWishList.add("pens");
        christmasWishList.add("books");
        christmasWishList.add("plane ticket to Paris");

        for (int i = 0; i < christmasWishList.size(); i++) {
            System.out.println((i + 1) + ": " + christmasWishList.get(i));
        }
    }
}
