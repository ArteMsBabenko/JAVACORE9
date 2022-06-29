package Lesson9;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws MyException {
		
		Scanner scanner = new Scanner(System.in);
		
		int a;
		int b;
		
		System.out.println("Enter the first number");
		
		if(scanner.hasNextInt()) {
			a = scanner.nextInt();
			
		if (scanner.hasNextInt()) {
			b = scanner.nextInt();
			
			Methods calc = new Methods(2,5);
			
			Methods.Result(calc.plus());
			Methods.Result(calc.minus());
			Methods.Result(calc.multiply());
			Methods.Result(calc.devide());
		  }
		
		else 
		System.out.println("Error! You must enter an integer");
		}
		else 
		System.out.println("Error! You must enter an integer");
	}

}
