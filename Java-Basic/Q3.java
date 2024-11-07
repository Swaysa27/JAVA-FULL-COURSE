// Swap two number with using third  variable or without using third variable 
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args){
     
System.out.println("..................Swapping two number with using third variable..............");

System.out.println("Enter first number:");
Scanner input = new Scanner(System.in);
int num = input.nextInt();
System.out.println("Enter second number:");
int num1 = input.nextInt();
int temp;
temp=num;
num=num1;
num1=temp;
System.out.println("..........After Swapping............");
System.out.println("First Number:"+num);
System.out.println("Second Number:"+num1);
System.out.println("\n\n");
System.out.println("***********Swap Two number without using third variable************");
System.out.println("Enter first number:");
int numb= input.nextInt();
System.out.println("Enter second number:");
int numb1= input.nextInt();
numb=numb-numb1;
numb1=numb1+numb;
numb=numb1-numb;
System.out.println("First Number:"+numb);
System.out.println("Second Number:"+numb1);
    }
}
