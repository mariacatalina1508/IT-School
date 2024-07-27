package session_16_collection_framework.challenge.array_list;

import java.util.ArrayList;
import java.util.List;

public class Challenge_6 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(7);
        list.add(9);
        list.add(18);
        list.add(22);
        list.add(52);
        list.add(72);

        System.out.println("The original list is: ");
        System.out.println(list);

        removeElement(list, 3);

        System.out.println("The updated list is: ");
    }

    public static void removeElement(List<Integer> list, int whichElement) {
       list.remove(whichElement - 1);
    }

    public static void displayList(List<Integer> list) {
        for(int element : list) {
            System.out.println(element + " ");
        }

        System.out.println();
    }
}
