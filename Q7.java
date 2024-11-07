// Calculate Area of Triangle
import java.util.Scanner;
public class Q7 {
 public static void main(String[] args) {
    System.out.println("Welcome to Area of Triangle Program");
    Scanner input=new Scanner(System.in);
    System.out.println("Enter Base of a Triangle:");
    float base =input.nextFloat();
    System.out.println("Enter height of a Triangle:");
    float height =input.nextFloat();

  double  area=0.5*height*base;
    // area of triangle=1/5*base *height;
    System.out.println("Area of Triangle:"+area);
 }   
}
