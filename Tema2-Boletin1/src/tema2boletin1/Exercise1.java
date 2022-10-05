package tema2boletin1;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num; //Variable declared and used to let the user introduce the number
		
		Scanner sc = new Scanner(System.in); //Scanner is started to introduce data into variables
		
		/*Prints a line to inform the user where he/she has to put the number, 
		then Scanner asks for it, so the scanner opens a space to let the user introduce it*/
		
		System.out.print("Introduzca un número: ");
		num = sc.nextInt();
		System.out.println();
		
		/*If the number is par, it will be printed, else, the program will print that it isn't*/
		
		if (num % 2 == 0) {
		
			System.out.println("El número introducido es par");
		
		} else {
			
			System.out.println("El número introducido no es par");
			
		}
		
		sc.close(); //Scanner is closed
		
	}

}
