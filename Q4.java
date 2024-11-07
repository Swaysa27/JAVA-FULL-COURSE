// Calculator program (add,sub,mul,div)
import java.util.Scanner;
public class Q4 {
    public static void main(String [] args){
System.out.println("Welcome to Calculator Program");
Scanner input= new Scanner(System.in);
System.out.println("Enter first number:");
int num=input.nextInt();
System.out.println("Enter second number:");
int num1=input.nextInt();
int add=num+num1;
int sub=num-num1;
int mul=num*num1;
int div=num/num1;
int mod=num%num1;
System.out.println("Additon "+add);
System.out.println("Subtraction "+sub);
System.out.println("Multiplication "+mul);
System.out.println("Divison "+div);
System.out.println("Modulator "+mod);
    }
}
