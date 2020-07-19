package ifElse;
import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x,y,z;
        System.out.print("Enter x= ");
        x= input.nextInt();
        System.out.print(" Enter y= ");
        y=input.nextInt();
        System.out.print("Enter z =");
        z=input.nextInt();
        if (x > y && x > z) System.out.println("X is larger");
        else if (y > z) System.out.println("Y is larger ");
        else {
            System.out.println("z is larger");
            System.out.println("program end");
        }
    }
}
