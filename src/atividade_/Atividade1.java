package atividade_;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int valorPrato = 0, valorSobremesa = 0, valorBebida = 0;
		
		System.out.println("Selecione um prato: \n 1-Vegetariano \n 2-Peixe \n 3-Frango \n 4-Carne");
		int Prato = entrada.nextInt();
		
		switch (Prato) {
		case 1:
			valorPrato = 180;
			break;
		case 2:
			valorPrato = 230;
			break;
		case 3:
			valorPrato = 250;
			break;
		case 4:
			valorPrato = 350;
			break;
		default:
			System.out.println("Prato inválido");
			break;
		}
		
		System.out.println("Selecione uma sobremesa: \n 1-Abacaxi \n 2-Sorvete diet \n 3-Mouse diet \n 5-Mouse chocolate");
		int Sobremesa = entrada.nextInt();
		
		switch (Sobremesa) {
		case 1:
			valorSobremesa = 45;
			break;
		case 2:
			valorSobremesa = 110;
			break;
		case 3:
			valorSobremesa = 170;
			break;
		case 4:
			valorSobremesa = 200;
		default:
			System.out.println("Sobremesa inválida");
			break;
		}
		
		System.out.println("Selecione uma bebida: \n 1-Chá \n 2-Suco de laranja \n 3-Suco de melão \n 4-Refrigerante diet");
		int Bebida = entrada.nextInt();
		
		switch (Bebida) {
		case 1:
			valorBebida = 20;
			break;
		case 2:
			valorBebida = 70;
			break;
		case 3:
			valorBebida = 100;
			break;
		case 4:
			valorBebida = 65;
			break;
		default:
			System.out.println("Bebida inválida");
			break;
		}
		
		int Valor = valorPrato + valorSobremesa + valorBebida;
		
		System.out.println("O valor calorico dessa refeição é: " + Valor);
	}

}
