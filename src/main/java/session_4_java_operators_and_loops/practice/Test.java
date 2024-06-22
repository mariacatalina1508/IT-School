package session_4_java_operators_and_loops.practice;

public class Test {

    public static void main(String[] args) {
        //local variable
        int num1 = 10;
        double num2 = 53.6;

        double result = num1 + num2;

        System.out.println(num1 + num2);

        TestUser testUser1 = new TestUser();
        TestUser testUser2 = new TestUser();

        boolean result2 = testUser1 == testUser2;

        TestUser.computeFormulaZ();

        String name1 = "Alice";
        String name2 = "John";
        String name3 = "John";
        String name4 = new String("John");

        String printValue = 10 > 5 ? testUser1.getMedicalHistory() : "john";
        System.out.println(printValue);

        for (int index = 0; index <= 10; index++) {
            System.out.println("Index value from for statement: " + index);
        }
    }
}
}
