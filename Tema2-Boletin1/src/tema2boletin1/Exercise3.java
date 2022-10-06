package tema2boletin1;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double num; //Variable declared and used to let the user introduce the number
		
		Scanner sc = new Scanner(System.in); //Scanner is started to introduce data into variables
		
		/*Prints a line to inform the user where he/she has to put the number, 
		then Scanner asks for it, so the scanner opens a space to let the user introduce it*/
		
		System.out.print("Introduzca un númreo: ");
		num = sc.nextDouble();
		System.out.println();
		
		/*If the numbers meet all the conditions, it will be printed that the number is casi-cero-,
		else, the program will print that they aren't*/
		
		if (num > -1 && num < 1 && num != 0) {
			
			System.out.println("El número introducido es casi-cero.");
			
		} else { 
			
			System.out.println("El número introducido no es casi-cero.");
			
		}
		
		sc.close();
		
	}

}
