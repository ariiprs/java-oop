package programmer.zaman.now.application;

import programmer.zaman.now.data.Customer;
import programmer.zaman.now.data.Level;
import programmer.zaman.now.data.LoginRequest;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class EnumApp {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Eko");
        customer.setLevel(Level.STANDARD);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());
        System.out.println(customer.getLevel().getDescription());

        String levelName = Level.VIP.name();
        System.out.println(levelName);

        Level level = Level.valueOf("PREMIUM");
        System.out.println(level);

        System.out.println("Print Level");
        for (var value : Level.values()){
            System.out.println(value);
        }

    }
}
