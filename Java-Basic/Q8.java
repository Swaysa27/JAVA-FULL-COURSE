// Simple Interst 
import java.util.Scanner;
public class Q8{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println(".........Welcome to Simple Interset Program .........");
        System.out.println("Enter Principle Amount:");
        float prin =input.nextFloat();
        System.out.println("Enter rate :");
        float rate =input.nextFloat();
        System.out.println("Enter time period:");
        float time =input.nextFloat();
        float SI=(prin*rate*time)/100;
        System.out.println("Enter time period: "+SI);


    }

}