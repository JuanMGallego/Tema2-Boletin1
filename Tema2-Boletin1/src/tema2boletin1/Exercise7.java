package tema2boletin1;

import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num; //Variable declared to store the number introduced by the user
		
		Scanner sc = new Scanner(System.in); //Scanner is started to introduce data into variables
		
		//Program will ask for a number between 1 and 5 digits and will open a space to introduce it
		
		System.out.print("Introduzca un número entre 0 y 99999: ");
		num = sc.nextInt();
		System.out.println();
		
		/*Firstly, it will detect if the number is less than 0 and it will give an error. Then if the number
		is between 0 and 99999 it will print the digits it has. And finally, if the user introduces a higher
		number, it will print a message*/
		
		if (num < 0) {
			
			System.out.println("El número introducido demasiado bajo, vuelve a intentarlo con otro.");
			
		} else if (num < 10) {
			
			System.out.println(num + " tiene 1 cifra.");
			
		} else if (num < 100) {
			
			System.out.println(num + " tiene 2 cifras.");
			
		} else if (num < 1000) {
			
			System.out.println(num + " tiene 3 cifras.");
			
		} else if (num < 10000) {
			
			System.out.println(num + " tiene 4 cifras.");
			
		} else if (num < 100000) {
			
			System.out.println(num + " tiene 5 cifras.");
			
		} else if (num >= 100000) {
			
			System.out.println("El número introducido es demasiado alto, vuelve a intentarlo con otro.");
			
		}
			
		sc.close(); //Scanner is closed
		
	}

}
