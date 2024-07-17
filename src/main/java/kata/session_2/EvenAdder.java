package kata.session_2;

import java.util.ArrayList;
import java.util.List;

public class EvenAdder {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(54);
        list.add(78);
        list.add(5);
        list.add(11);

        System.out.println("The sum for the number of the list: " + sumEvenNumbers(list));

        List<Integer> myPopulatedList = new ArrayList<>();
        int integerLimit = 100;

        System.out.println("myPopulatedlist is: " + populateList(integerLimit, myPopulatedList));
        System.out.println("The sum for the number from the myList: " + sumEvenNumbers(myPopulatedList));
    }

    public static int sumEvenNumbers(List<Integer> list) {
        int sum = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                sum += list.get(i);
            }
        }

        return sum;
    }


    public static List<Integer> populateList(int integerLimit, List<Integer> myList) {
        for (int i = 1; i <= integerLimit; i++) {
            myList.add(i);
        }

        return myList;
    }
}