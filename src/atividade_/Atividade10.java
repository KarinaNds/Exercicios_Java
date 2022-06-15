package atividade_;

import java.util.*;

public class Atividade10 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double saldo;
		System.out.println("Digite o saldo:");
		saldo = entrada.nextDouble();
		
		System.out.printf("O seu saldo foi para:" + saldo * 1.5);
		
		entrada.close();

	}

}
