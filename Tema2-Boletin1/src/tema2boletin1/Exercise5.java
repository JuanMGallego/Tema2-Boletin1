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
		
		if (num3 > num2 && num2 > num1) {
			
			System.out.println("Ordenados de mayor a menor: " + num1 + " > " + num2 + " > " + num3);
			
		} else if (num3 < num2) {
		
			
			
		}
		
	}

}
