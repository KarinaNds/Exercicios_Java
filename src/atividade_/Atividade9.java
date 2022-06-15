package atividade_;

import java.util.*;

public class Atividade9 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		double salarioMinimo = 1.212;
		double userSalario;
		
		System.out.println("Digite seu salario");
		userSalario = entrada.nextDouble();
		
		double calculo = userSalario / salarioMinimo;
		
		System.out.printf("Seu salario é: %.0f", calculo);

	}

}
