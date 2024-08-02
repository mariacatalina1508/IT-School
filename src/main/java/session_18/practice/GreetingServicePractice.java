package session_18.practice;

public class GreetingServicePractice {

    public static void main(String[] args) {
        //using anonymous class
        GreetingService anonymousGreetingService = new GreetingService() {
            @Override
            public void greet(String message) {
                System.out.println(message + " from anonymous class");
            }
        };

        anonymousGreetingService.greet("Hello world");

        //using lambda expression
        GreetingService lambdaGreetingService = input -> System.out.println(input + " from lambda expression");
        lambdaGreetingService.greet("Hello world");
    }
}