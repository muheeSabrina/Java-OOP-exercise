package Week2Exercise;
import java.util.Scanner;

public class Week2Main {

    /**
     * declare a constructor named Week2Main with a string parameter called name
     * **/

    Week2Main(String name){
        System.out.println("Good Morning," + name);
    }

    Week2Main(){
        System.out.println("Default called");
    }

    /** inside Week2Main class declare a method named sum with static key word return type void.
     your method should accept two int input as parameter and print the sum of the method in the method.
     call it to main method **/
    public static void sum(int x, int y){
        int add = x+y;
        System.out.println("The sum of "+ x + " and " + y + " is " + add );
    }

    public static void sum(int x,int y, int z){
        int add = x+y+z;
        System.out.println("The sum of " + x + " and " + y + " and " + z + " is " + add);
    }

    public static void sum(float x,float y){
        float add = x+y;
        System.out.println("The sum of "+ x + " and " + y + " is " + add );
    }
    public static void sum(float x, float y, float z){
        float add = x+y+z;
        System.out.println("The sum of " + x + " and " + y + " and " + z + " is " + add);
    }

    public static void main(String[] args){
        Week2Main obj1= new Week2Main("Sabrina");
        Week2Main obj2 = new Week2Main();
        sum(2,5);
        sum(10,20,30);
        sum((float)2.4,(float)5.2);
        sum((float)3.4,(float)5,(float)5.6);
    }
}
