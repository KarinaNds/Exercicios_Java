package atividade_;

import java.util.*;

public class Atividade19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double real, dolar, conversao;
		
		System.out.println("Digite o valor em R$");
		real = sc.nextDouble();
		System.out.println("Digite o valor da cota��o US$");
		dolar = sc.nextDouble();
		
		conversao = real / dolar;
		
		System.out.println("Voce tem US$" + conversao);
		
		sc.close();

	}

}
