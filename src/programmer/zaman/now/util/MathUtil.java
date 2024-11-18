package programmer.zaman.now.util;

public class MathUtil {


//    ini adalah static method
    public static int sum(int... values){
        int total = 0;
        for(var value : values){
            total += value;
        }

        return total;

    }
}
