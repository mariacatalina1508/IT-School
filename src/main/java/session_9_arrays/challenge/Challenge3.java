package session_9_arrays.challenge;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Challenge3 {
    // 3. Create 2 empty ArrayLists: studentList and graduateStudentList
    //populate studentList with 10 students
    //copy values from studentList to graduateStudentList
    //iterate through graduateStudentList and print each graduated student

    public static void main(String[] args) {
        ArrayList<String> studentList = new ArrayList<>();
        ArrayList<String> graduatestudentList = new ArrayList<>();

        int noOfStudent = 10;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < noOfStudent; i ++) {
            System.out.println("Please, enter a student: ");
            studentList.add(sc.nextLine());
        }

        JPopupMenu graduateStudentList = null;
        graduateStudentList.add(studentList.get(2));
        graduateStudentList.add(studentList.get(4));
        graduateStudentList.add(studentList.get(6));
        graduateStudentList.add(studentList.get(8));

        System.out.println("Graduate Students: ");
        for (String graduateStudent : graduatestudentList) {
            System.out.println(graduateStudent + " ");
        }

        sc.close();
    }
}
