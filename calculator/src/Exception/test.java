package Exception;

import java.util.Scanner;

public class test {
public static void main(String[] args) {
	
	
	Cal cal = new Cal();
	
		Scanner scn = new Scanner(System.in);
		System.out.println("Hello welcome to my calculator");
		System.out.println("------------------------------");
		System.out.println("What would you like to do? please enter a number");
		System.out.println("1.Addition");
		System.out.println("2.Substraction");
		System.out.println("3.Division");
		System.out.println("4.Multiplication");
		System.out.println("5.Exit");
		
		int choice = scn.nextInt();
		
		switch (choice) {
		case 1:
			System.out.println("Good choice- addition");
			System.out.println("the result is "+cal.plus());
			break;
		case 2:
			System.out.println("Good choice- subtraction");
			System.out.println("the result is "+cal.minus());
			break;
		case 3:
			System.out.println("Good choice- division");
			System.out.println("the result is "+cal.division());
			break;
		case 4:
			System.out.println("Good choice- multiplication");
			System.out.println("the result is "+cal.multiply());
			break;
		case 5:
			System.out.println("Exiting Program");
			break;
		default:
			System.out.println("I know only so much mathematics. please enter a valid choice");	
		}
			
}
}		
			
