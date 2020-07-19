package assignment;
import java.util.Scanner;
public class season {
    public static void main(String[] args)
     {
        Scanner input = new Scanner(System.in);
        int c;
        System.out.print("Enter c= ");
        c= input.nextInt();
        if (c >= 30)
        {System.out.println("summer");}
        else if (c >= 20  && c < 30 )
        {System.out.println("spring ");}
        else if (c >= 10 && c < 20)
        {System.out.print("winter");}
        else {
            System.out.println("dont know");
        }


    }



}



