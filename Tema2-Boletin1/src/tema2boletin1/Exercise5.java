package tema2boletin1;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1, num2, num3; //Variable declared and used to let the user introduce the numbers
		
		Scanner sc = new Scanner(System.in); //Scanner is started to introduce data into variables
		
		/*Prints a line to inform the user where he/she has to put the numbers, 
		then Scanner asks for them, so the scanner opens a space to let the user introduce it*/
		
		System.out.print("Introduzca un número: ");
		num1 = sc.nextInt();
		
		System.out.print("Introduzca otro número: ");
		num2 = sc.nextInt();
		
		System.out.print("Introduzca un tercer: ");
		num3 = sc.nextInt();
		System.out.println();
		
		/*The program will search for the correct order between all the options that the user 
		could give, then it will print the solution*/
		
		if (num3 > num2 && num2 > num1) {
			
			System.out.println("Ordenados de mayor a menor: " + num1 + " > " + num2 + " > " + num3);
			
		} else if (num1 > num2 && num2 > num3) {
			
			System.out.println("Ordenados de mayor a menor: " + num3 + " > " + num2 + " > " + num1);
					
		} else if (num3 > num1 && num1 > num2) {
			
			System.out.println("Ordenados de mayor a menor: " + num2 + " > " + num1 + " > " + num3);
			
		} else if (num2 > num3 && num3 > num1) {
			
			System.out.println("Ordenados de mayor a menor: " + num1 + " > " + num3 + " > " + num2);
			
		} else if (num2 > num1 && num1 > num3) {
			
			System.out.println("Ordenados de mayor a menor: " + num3 + " > " + num1 + " > " + num2);
			
		} else if (num1 > num3 && num3 > num2) {
			
			System.out.println("Ordenados de mayor a menor: " + num2 + " > " + num3 + " > " + num1);
		
		/*If there were two equal numbers, the program will tell you to restart the verification 
		with 3 different numbers.*/
			
		} else if (num1 == num2 || num2 == num3 || num3 == num1) {
			
			System.out.println("Has introducido dos números iguales, vuelve a introducir 3 números");
			
		}
		
		sc.close(); //Scanner is closed
		
	}

}
