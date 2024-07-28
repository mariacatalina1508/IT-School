package session_16_collection_framework.challenge.linked_list;

import java.util.LinkedList;

public class Challenge_8 {

    public static void main(String[] args) {


        LinkedList<Integer> myLinkedList = new LinkedList<>();
        myLinkedList.add(8);
        myLinkedList.add(50);
        myLinkedList.add(31);
        myLinkedList.add(64);
        myLinkedList.add(5);
        myLinkedList.add(19);
        myLinkedList.add(88);

        System.out.println("The original LinkedList: ");
        displayLinkedList(myLinkedList);

        myLinkedList.addLast(150);

        System.out.println("Linked list after insert an element at the end.");
        displayLinkedList(myLinkedList);

        myLinkedList.addLast(300);

        System.out.println("Linked list after insert an element at the end.");
        displayLinkedList(myLinkedList);

        myLinkedList.offerLast(200);

        System.out.println("Linked list after insert an element at the end.");
        displayLinkedList(myLinkedList);
    }

    public static void displayLinkedList(LinkedList<Integer> myLinkedList) {
        for (int element : myLinkedList) {
            System.out.println(element + " ");
        }
        System.out.println();
    }
}
