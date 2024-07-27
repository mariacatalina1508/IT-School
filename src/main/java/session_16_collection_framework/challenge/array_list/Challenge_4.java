package session_16_collection_framework.challenge.array_list;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Challenge_4 {

    public static void main(String[] args) {
        final int MAX_LENGHT = 100;

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> myList = new ArrayList<>();

        for (int i = 0; i < MAX_LENGHT; i++) {
            System.out.println("Please enter a element: ");
            myList.add(sc.nextInt());

            int myIndex = 0;
            if (myIndex < 0 || myIndex > MAX_LENGHT) {
                System.out.println("Invalid index");
            }else {
                System.out.println("The element from index " + myIndex + " is" + myList.get(myIndex));
            }
        }
    }
}
