package kata.session_6;

import java.util.Scanner;
import java.util.*;

public class MaxInteger {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        System.out.println("Enter first number: ");
        list.add(scanner.nextInt());
        System.out.println("Enter second number: ");
        list.add(scanner.nextInt());
        System.out.println("Enter third number: ");
        list.add(scanner.nextInt());

        Collections.sort(list);
        System.out.println("The largest number of the list: " + list.get(list.size() -1));

        //Collections.max(list);
    }
}