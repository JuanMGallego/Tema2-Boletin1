package tema2boletin1;

import java.util.Scanner;

public class Exercise8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float mark; //Variable declared to store the number introduced by the user
		
		Scanner sc = new Scanner(System.in); //Scanner is started to introduce data into variables
		
		//Program will ask for a number between 0 and 10 and will open a space to introduce it
		
		System.out.print("Introduzca la nota numérica del alumno: ");
		mark = sc.nextFloat();
		System.out.println();
		
		/*Firstly, it will detect if the number is less than 0 and it will give an error. Then if the number
		is between 0 and 10 it will print the digits it has. And finally, if the user introduces a higher
		number, it will print a message*/
		
		if (mark < 0) {
			
			System.out.println("El número introducido demasiado bajo, vuelve a intentarlo con otro.");
			
		} else if (mark < 5) {
			
			System.out.println(mark + " --> INSUFICIENTE");
			
		} else if (mark < 6) {
			
			System.out.println(mark + " --> SUFICIENTE");
			
		} else if (mark < 7) {
			
			System.out.println(mark + " --> BIEN");
			
		} else if (mark < 9) {
			
			System.out.println(mark + " --> NOTABLE");
			
		} else if (mark <= 10) {
			
			System.out.println(mark + " --> SOBRESALIENTE");
			
		} else if (mark > 10) {
			
			System.out.println("El número introducido es demasiado alto, vuelve a intentarlo con otro.");
			
		}

		sc.close(); //Scanner is closed
		
	}

}
