package session_16_collection_framework.challenge.linked_list;

import java.util.LinkedList;

public class Challenge_7 {

    public static void main(String[] args) {


        LinkedList<String> visitedPlaces = new LinkedList<>();
        visitedPlaces.add("New York");
        visitedPlaces.add("Los Angeles");
        visitedPlaces.add("Mexico");
        visitedPlaces.add("San Francisco");
        visitedPlaces.add("Berlin");
        visitedPlaces.add("Paris");

        System.out.println("The original LinkedList: ");
        displayVisitPlace(visitedPlaces);

        visitedPlaces.offerFirst("Madrid");

        System.out.println("Linked list after insert the specified element.");
        displayVisitPlace(visitedPlaces);

        visitedPlaces.addFirst("Philadelphia");

        System.out.println("Linked list after insert another specified element.");
        displayVisitPlace(visitedPlaces);

        visitedPlaces.push("California");

        System.out.println("Linked list after insert another specified element");
        displayVisitPlace(visitedPlaces);
    }

    public static void displayVisitPlace(LinkedList<String> VisitPlace) {
        for (String place : VisitPlace) {
            System.out.println(place + " ");
        }
        System.out.println();
    }
}
