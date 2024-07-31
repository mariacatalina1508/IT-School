package session_16_collection_framework.challenge.linked_list;

import java.util.LinkedList;
import java.util.ListIterator;

public class Challenge_3 {

    public static void main(String[] args) {
        LinkedList<String> visitedPlaces = new LinkedList<>();
        visitedPlaces.add("New York");
        visitedPlaces.add("San Francisco");
        visitedPlaces.add("Mexico");
        visitedPlaces.add("Paris");
        visitedPlaces.add("Los Angeles");

        int startPosition = 4;

        ListIterator<String> iterator = visitedPlaces.listIterator(startPosition);
        while (iterator.hasPrevious()) {
            String place = iterator.previous();
            System.out.println("place: " + place);
        }
    }
}
