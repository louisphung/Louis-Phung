import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Time t1 = new Time(16, 59, 59);
        System.out.println("Time: "+ t1);
        System.out.println("Next second: " + t1.nextSecond());

        t1 = new Time(16, 59, 59);
        System.out.println("Time: "+ t1);
        System.out.println("Previous second: " + t1.previousSecond());
        System.out.println();

        Time t2 = new Time(8, 43, 78);
        System.out.println("Time: "+ t2);
        System.out.println("Next second: " + t2.nextSecond());

        t2 = new Time(8, 43, 78);
        System.out.println("Time: "+ t2);
        System.out.println("Previous second: " + t2.previousSecond());
        System.out.println();

        Time t3 = new Time(24, 54, 82);
        System.out.println("Time: "+ t3);
        System.out.println("Next second: " + t3.nextSecond());

        t3 = new Time(24, 54, 82);
        System.out.println("Time: "+ t3);
        System.out.println("Previous second: " + t3.previousSecond());
        System.out.println();


    }
}