package functional.programming.example;

public class Main {
    public static void main(String[] args) {
        //worst way: we write different interfaces just to change a single message of 'sayHello' method
        Greeting greeting = new Hello();
        greeting.sayHello();

        //better, but not too much because it is verbose
        Greeting greeting1 = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello World!");
            }
        };
        greeting1.sayHello();

        //much better way: using Lambda
        Greeting greeting2 = ()-> System.out.println("Hello World!");
        greeting2.sayHello();
    }
}
