package input;

import java.util.Scanner;
class hello{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String name;
        name = input.next();
        System.out.println("Hello " + name );
        System.out.println("Welcome," + name + " to home");
    }
}
