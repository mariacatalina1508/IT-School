package session_16_collection_framework.challenge.linked_list;

import java.util.LinkedList;

public class Challenge_7 {

    public static void main(String[] args) {


        LinkedList<String> VisitPlace = new LinkedList<>();
        VisitPlace.add("New York");
        VisitPlace.add("Los Angeles");
        VisitPlace.add("Mexico");
        VisitPlace.add("San Francisco");
        VisitPlace.add("Berlin");
        VisitPlace.add("Paris");

        System.out.println("The original LinkedList: ");
        displayVisitPlace(VisitPlace);

        VisitPlace.offerFirst("Madrid");

        System.out.println("Linked list after insert the specified element.");
        displayVisitPlace(VisitPlace);

        VisitPlace.addFirst("Philadelphia");

        System.out.println("Linked list after insert another specified element.");
        displayVisitPlace(VisitPlace);

        VisitPlace.push("California");

        System.out.println("Linked list after insert another specified element");
        displayVisitPlace(VisitPlace);
    }

    public static void displayVisitPlace(LinkedList<String> VisitPlace) {
        for (String place : VisitPlace) {
            System.out.println(place + " ");
        }
        System.out.println();
    }
}
