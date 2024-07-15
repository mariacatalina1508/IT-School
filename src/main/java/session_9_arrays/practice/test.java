package session_9_arrays.practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class test {

    public static void main(String[] args) {
        int[] myArray = {5, 9, 3};
        //         index 0  1  2


        int[] numbers = new int[3];

        int firstArrayElement = myArray[0];
        int arrayLength = myArray.length;

        System.out.println("First array element: " + firstArrayElement);
        System.out.println("Array length: " + arrayLength);

        for (int index = 0; index < myArray.length; index++) {
            System.out.print(myArray[index] + " ");
        }

        ArrayList<String> list1 = new ArrayList<>();
        List<String> list2 = new LinkedList<>();
        List<String> list3 = new ArrayList<>();

        String name = null;
    }
}
