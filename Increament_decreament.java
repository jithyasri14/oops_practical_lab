package oop_practical;
import java.util.Scanner;
public class Increament_decreament {
	public static void main(String[] args) {

	    Scanner input = new Scanner(System.in);

	    System.out.print("Enter value for a: ");
	    int a = input.nextInt();

	    System.out.print("Enter value for b: ");
	    int b = input.nextInt();

	    int result1, result2;

	    System.out.println("Original value of a: " + a);

	    result1 = ++a;
	    System.out.println("After incrementing a: " + result1);

	    System.out.println("Original value of b: " + b);

	    result2 = --b;
	    System.out.println("After decrementing b: " + result2);

	    input.close();
	  }
	}
