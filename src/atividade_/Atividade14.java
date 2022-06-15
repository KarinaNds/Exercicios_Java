package atividade_;

import java.util.*;

public class Atividade14 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int valor, soma = 0;
		
		for(int i = 1; i < 11; i++) {
			System.out.println(i + "-Digite os numeros:");
			valor = entrada.nextInt();
			
			soma += valor;
		}
		
		System.out.println(soma);

	}

}
