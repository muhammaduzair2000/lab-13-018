import java.io.IOException;
import java.util.*;
public class exception {
	 public static void main(String args[]) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the integer a: ");
		 int num1 = sc.nextInt();
		 Scanner sc2 = new Scanner(System.in);
		 System.out.println("Enter the integer b : ");
		 int num2 = sc.nextInt();
		 try {
			 int Answer = num1/num2;
			 System.out.println
			 (Answer);	
			 }
		 catch (ArithmeticException e) {
			 System.out.println("ArithmeticException");
			 System.out.println("Weather is good");
			 }
		 }
	 }		 
