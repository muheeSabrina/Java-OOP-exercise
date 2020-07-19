package ifElse;

public class ex1 {
    public static void main(String[] args) {
        int x = 10, y = 20, z = 30;
        if (x > y && x > z) System.out.println("X is larger");
        else if (y > z) System.out.println("Y is larger ");
        else {
            System.out.println("z is larger");
            System.out.println("program end");
        }
    }
}
