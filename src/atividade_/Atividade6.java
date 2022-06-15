package atividade_;

import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero, antecessor, sucessor;
		
		System.out.println("Informe um numero:");
		numero = sc.nextInt();
		
		antecessor = numero - 1;
		sucessor = numero + 1;
		
		System.out.println("O antecessor do" + numero + "é:" + antecessor);
		System.out.println("O sucessor do" + numero + "é:" + sucessor);
			

	}

}
