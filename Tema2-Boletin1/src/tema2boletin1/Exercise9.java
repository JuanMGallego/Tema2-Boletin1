package tema2boletin1;

import java.util.Scanner;

public class Exercise9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int p1, p2; //Variables are declared and used to store user's selection
		final int PIEDRA = 1, PAPEL = 2, TIJERAS = 3; //Constant used to identify user's selection and relate them to the options in the game
		
		Scanner sc = new Scanner(System.in); //Scanner is started to introduce data into variables
		
		//information to the user and the program will ask for both selections
		
		System.out.println("PIEDRA [1] - PAPEL [2] - TIJERAS [3]");
		System.out.println();
		System.out.print("Jugador 1 haga su elección: ");
		p1 = sc.nextInt();
		System.out.print("Jugador 2 haga su elección: ");
		p2 = sc.nextInt();
		System.out.println("");
		
		//If the user introduces a value different of which the program gives, it will say who has introduced the wrong data
		
		if (p1 < 1 || p1 > 3) {
			
			System.out.println("El jugador 1 no ha introducido un valor válido");
			
		} else if (p2 < 1 || p2 > 3) {
			
			System.out.println("El jugador 2 no ha introducido un valor válido");
			
		} else {
			
			if (p1 == p2) { //If them where the same it will print a draw
				
				System.out.println("¡EMPATE!");
				
			//Else it will search for the win of the first player, but if it doesn't take place, it will print that player 2 has won 
				
			} else if (p1 == PIEDRA && p2 == TIJERAS || p1 == PAPEL && p2 == PIEDRA || p1 == TIJERAS && p2 == PAPEL) {
				
				System.out.println("El juagdor 1 ha ganado");
				
			} else {
				
				System.out.println("El jugador 2 ha ganado");
				
			}
			
		}
		
		sc.close(); //Scanner is closed
		
	}

}
