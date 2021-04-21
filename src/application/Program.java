package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {                                    //roda o programa
		String[] vect = sc.nextLine().split(" ");
		int position =sc.nextInt();
		System.out.println(vect[position]);
		}
		catch(ArrayIndexOutOfBoundsException e) {//captura o erro vetor que não existe
			System.out.println("Invalid Position!");
		}	
		catch(InputMismatchException e) {        //captura o erro letra ao invés
			System.out.println("Input error!"); //de número
		}
			System.out.println("End of Program");
		
		sc.close();
	}

}
