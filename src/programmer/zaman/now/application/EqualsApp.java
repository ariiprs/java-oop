package programmer.zaman.now.application;

public class EqualsApp {

    public static void main(String[] args) {

        String first = "Arie";
        first = first + " " + "Prasetyo";

        String second = "Arie Prasetyo";

        System.out.println(first == second);
        System.out.println(first.equals(second));

        String third = "Arie Prasetyo";

        System.out.println(second == third);
    }
}
