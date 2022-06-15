package atividade_;

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		int idade;
		
		System.out.println("Digite sua idade para saber se você tem direito de votar:");
		idade = entrada.nextInt();
		
		if(idade < 16) {
			System.out.println("Não eleitor");
		}else if(idade >= 18 && idade <= 65) {
			System.out.println("Eleitor obrigatorio");
		}else {
			System.out.println("Eleitor facultativo");
			
}
		
	}
	
}