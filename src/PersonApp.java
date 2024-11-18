public class PersonApp {

    public static void main(String[] args) {

        var person1 = new Person("Ari", "Tangerang");

        Person person2 = new Person("dani");


        Person person3 = new Person();
        person3.name  = "Ima";
        person3.address  = "Cikupa";

        Person person4 = new Person();
        person4.name  = "Budi";
        person4.address  = "Cikupa";


        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);
        person1.sayHello("Budi");

        System.out.println(person2.name);

        System.out.println(person4.name + person4.address);

    }
}
