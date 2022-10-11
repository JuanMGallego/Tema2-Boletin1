package tema2boletin1;

import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un número entre 0 y 99999: ");
		num = sc.nextInt();
		System.out.println();
		
		if (num < 10) {
			
			System.out.println(num + " tiene 1 cifra.");
			
		} else if (num < 100) {
			
			System.out.println(num + " tiene 2 cifras.");
			
		}
		
		
		
	}

}
