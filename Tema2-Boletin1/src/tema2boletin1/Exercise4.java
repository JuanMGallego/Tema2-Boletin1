package tema2boletin1;

import java.util.Scanner;

public class Exercise4 {

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
		
		/*If num1 is smaller than num2, it will be printed in that order, else, the program
		will show them in reverse*/
		
		if (num1 < num2) {
		
			System.out.println("Ordenados de menor a mayor: " + num1 + " < " + num2);
		
		} else {
			
			System.out.println("Ordenados de menor a mayor: " + num2 + " < " + num1);
			
		}
		
		sc.close(); //Scanner is closed
		
	}

}
