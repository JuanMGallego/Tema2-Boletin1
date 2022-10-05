package tema2boletin1;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1, num2; //Variable declared and used to let the user introduce the numbers
		
		Scanner sc = new Scanner(System.in); //Scanner is started to introduce data into variables
		
		/*Prints a line to inform the user where he/she has to put the numbers, 
		then Scanner asks for them, so the scanner opens a space to let the user introduce it*/
		
		System.out.print("Introduzca un número: ");
		num1 = sc.nextInt();
		
		System.out.print("Introduzca otro número: ");
		num2 = sc.nextInt();
		System.out.println();
		
		/*If the numbers are the same, it will be printed, else, the program will print that they aren't*/
		
		if (num1 == num2) {
		
			System.out.println("Los números introducidos son iguales");
		
		} else {
			
			System.out.println("Los números introducidos no son iguales");
			
		}
		
		sc.close(); //Scanner is closed
		
	}

}
