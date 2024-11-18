public class PolymorphismApp {

    public static void main(String[] args) {

        Employee employee = new Employee("Ari");
        employee.sayHello("Nani");

        employee = new Manager("ima");
        employee.sayHello("rika");

        employee = new VicePresident("pams");
        employee.sayHello("ran");

        sayHello(new Employee("jani"));

    }

    static void sayHello(Employee employee) {
        if (employee instanceof VicePresident){
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP" + vicePresident.name);
        }else if(employee instanceof Manager){
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager" + manager.name);
        }else {
            System.out.println("Hello Employee" + employee.name);
        }

    }
}
