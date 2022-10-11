package tema2boletin1;

import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b, c; //Variables declared and used to let the user introduce the values of a, b and c
		double sol1, sol2; //Variables declared and used to store the two different solutions and then print it
		double raiz;
		
		Scanner sc = new Scanner(System.in); //Scanner is started to introduce data into variables
		
		//title
		
		System.out.println("Calculadora de operaciones de segundo grado (ax^2 + bx + c = 0)");
		System.out.println();
		
		//Program will ask the user for the variables and the scanner opens a space to let the user introduce them
		
		System.out.print("Introduzca el valor de 'a': ");
		a = sc.nextInt();
		System.out.print("Introduzca el valor de 'b': ");
		b = sc.nextInt();
		System.out.print("Introduzca el valor de 'c': ");
		c = sc.nextInt();
		System.out.println();
		
		raiz = b * b - 4 * a * c;
		
		//Two different results of the quadratic operation
		
		sol1 = (-b + Math.sqrt(raiz))/(2*a);
		sol2 = (-b - Math.sqrt(raiz))/(2*a);
		
		/*When the square root have a negative number, it won't have solution and it will be printed, but if not,
		the two solutions will be showed to the user*/
		
		if ((raiz) < 0 ) {
			
			System.out.println("La operación no tiene solución");
			
		} else {
			
			System.out.println("Las soluciones son: " + sol1 + " y " + sol2);
			
			
		}
		
		sc.close(); //Scaner is closed
		
	}

}
