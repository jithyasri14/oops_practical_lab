package oop_practical;
import java.util.Scanner; 
public class Arithmetic_operators {
		  public static void main(String[] args) {

		 Scanner input = new Scanner(System.in);

		 System.out.print("Enter value of a: ");
		 int a = input.nextInt();

		 System.out.print("Enter value of b: ");
		 int b = input.nextInt();
		 
		 System.out.println("a + b = " + (a + b));
		 System.out.println("a - b = " + (a - b));
		 System.out.println("a * b = " + (a * b));
		 System.out.println("a / b = " + (a / b));
		 System.out.println("a % b = " + (a % b));

		  }
		}
