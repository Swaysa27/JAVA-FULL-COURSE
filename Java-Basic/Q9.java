// Compound Interest
import java.util.Scanner;
public class Q9{
    public static void main(String[] args) {
        System.out.println("..........Welcome to Compound Interest Program...........");
        Scanner input= new Scanner(System.in);
        System.out.println("Enter principle amount:");
   int p=input.nextInt();
        System.out.println("Enter rate of interst:");
        int r=input.nextInt();
        System.out.println("Enter time period:");
        int t=input.nextInt();
        int CI=(int) Math.pow((p*(1+r/100)),t);
        System.out.println("Compound Interest:"+CI);

    }
}
