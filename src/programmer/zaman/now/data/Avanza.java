package programmer.zaman.now.data;

public class Avanza implements Car{

    public String getBrand(){
        return "Toyota";
    }

    public void drive(){
        System.out.println("Avanza drive");
    }

    public int getTire(){
        return 4;
    }

    public boolean isMaintenance(){
        return false;
    }
}
