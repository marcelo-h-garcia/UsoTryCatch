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
		catch(ArrayIndexOutOfBoundsException e) {//captura o erro vetor que n�o existe
			System.out.println("Invalid Position!");
		}	
		catch(InputMismatchException e) {        //captura o erro letra ao inv�s
			System.out.println("Input error!"); //de n�mero
		}
			System.out.println("End of Program");
		
		sc.close();
	}

}
