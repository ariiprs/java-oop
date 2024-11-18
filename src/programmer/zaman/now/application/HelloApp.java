package programmer.zaman.now.application;

import programmer.zaman.now.data.Hello;

public class HelloApp {

    public static void main(String[] args) {

        Hello english = new Hello() {

            public void sayHello() {
                System.out.println("Hello");
            }

            public void sayHello(String name) {
                System.out.println("Hello " + name);
            }
        };

        english.sayHello();
        english.sayHello("ima");

    }
}
