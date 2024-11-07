// PERIMETER OF RECTANGLE 
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        System.out.println("Welcome to the Rectangle Program ");
        Scanner input=new Scanner(System.in);
        System.out.println("1.Perimeter of Rectangle\n2.Area of Rectangle ");
        int num=input.nextInt();
            switch(num){
            case 1 : 
                System.out.println("Enter 4 sides of Rectangle: ");
                float num1=input.nextFloat();
                float num2=input.nextFloat();
                float num3=input.nextFloat();
                float num4=input.nextFloat();
                float peri=num1+num2+num3+num4;
                System.out.println("Perimeter of Rectangle: "+peri);
                break;
            
            case 2 : 
                System.out.println("Enter lenght and breadth of Rectangle: ");
                float num5=input.nextFloat();
                float num6=input.nextFloat();
                float area=num5*num6;
                System.out.println("Area of Rectangle: "+area);
                break;
            
            default: System.out.println("Enter correct choice :");
            break;
        }

    }
}
