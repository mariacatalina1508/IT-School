package session_16_collection_framework.challenge.linked_list;

import java.util.LinkedList;

public class Challenge_10 {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(45);
        list.add(24);
        list.add(18);
        list.add(76);
        list.add(99);
        list.add(6);
        list.add(45);
        list.add(18);
        list.add(1);

        int elementToFind = 99;

        int firstOccurence = list.indexOf(elementToFind);
        int lastOccurence = list.lastIndexOf(elementToFind);

        System.out.println("First occurence: " + firstOccurence);
        System.out.println("Last occurence: " + lastOccurence);

    }
}
