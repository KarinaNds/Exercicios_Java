package atividade_;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero;
		
		System.out.print("Digite um numero:");
		numero = sc.nextInt();
		
		if(numero % 10 == 0) {
		   System.out.print("Esse numero é divisivel por 10");
		} else if(numero % 5 == 0) {
			System.out.print("Esse numero é divisivel por 5");
		} else if(numero % 2 == 0) {
			System.out.print("Esse numero é divisivel por 2");
		} else {
			System.out.print("Não é possivel dividir");
			
		}
	
		

	}

}
