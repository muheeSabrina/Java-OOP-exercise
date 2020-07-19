package converter;
import java.util.Scanner;
public class calciusToFarenheit {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double f,c;
        System.out.print("Enter temp in farenheit =");
        f= input.nextFloat();
        c=(f-32)*0.556;
        System.out.println("Enter temp in celcius=" +c);



    }
}
