package oop_practical;
import java.util.Scanner;
public class assingment {
	public static void main(String[] args) {
	      int a, var;
	      Scanner sc = new Scanner(System.in);
	      a= sc.nextInt();
	      var= sc.nextInt();
	      var = a;
	      System.out.println("var using =: " + var);
	      var += a;
	      System.out.println("var using +=: " + var);
	      var *= a;
	      System.out.println("var using *=: " + var);
	    }
}
