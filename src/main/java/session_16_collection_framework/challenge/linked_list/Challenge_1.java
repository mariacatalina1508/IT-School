package session_16_collection_framework.challenge.linked_list;

import java.util.LinkedList;

public class Challenge_1 {
    // Write a Java program to append the specified element to the end of a linked list.

    public static void main(String[] args) {
        LinkedList<String> visitThePlace = new LinkedList<>();
        visitThePlace.add("Los Angeles");
        visitThePlace.add("New York");
        visitThePlace.add("Houston");
        visitThePlace.add("Dallas");
        visitThePlace.add("San Diego");

        System.out.println("Original list: ");
        displayList(visitThePlace);

        visitThePlace.addLast("Columbus");

        System.out.println("Updated list: ");
        displayList(visitThePlace);
    }

    public static void displayList(LinkedList<String> visitThePlace) {
        for (String place : visitThePlace) {
            System.out.print(place + " ");
        }

        System.out.println();
    }
}