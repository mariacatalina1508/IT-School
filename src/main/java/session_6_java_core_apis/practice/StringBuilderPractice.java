package session_6_java_core_apis.practice;

public class StringBuilderPractice {

    public static void main(String[] args) {
        String result = "";
        for (int index = 0; index < 10; index++) {
            //aa
            //aaa
            //aaaa
            //aaaaa
            result += "a";
        }
        System.out.println("With String: " + result);

        StringBuilder sb = new StringBuilder();
        for (int index = 0; index < 10; index++) {
            //aaaaaaa
            sb.append("a");
        }
        String result2 = sb.toString();
        System.out.println("With StringBuilder: " + result2);
    }
}
