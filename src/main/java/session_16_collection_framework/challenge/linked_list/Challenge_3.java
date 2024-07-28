package session_16_collection_framework.challenge.linked_list;

import java.util.LinkedList;
import java.util.ListIterator;

public class Challenge_3 {

    public static void main(String[] args) {
        LinkedList<String> VisitPlace = new LinkedList<>();
        VisitPlace.add("New York");
        VisitPlace.add("San Francisco");
        VisitPlace.add("Mexico");
        VisitPlace.add("Paris");
        VisitPlace.add("Los Angeles");

        int startPosition = 4;

        ListIterator<String> iterator = VisitPlace.listIterator(startPosition);
        while (iterator.hasPrevious()) {
            String place = iterator.previous();
            System.out.println("place: " + place);
        }
    }
}
