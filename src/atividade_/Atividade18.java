package atividade_;

import java.util.*;

public class Atividade18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] idades = new int[10];
		String[] nomes = new String[10];
		int maisNovo = 100;
		
		for(int i = 0; i < 10; i++){
			System.out.print("Insira um nome:");
			nomes[i] = sc.nextLine();
			System.out.print("Insira uma idade:");
			idades[i] = sc.nextInt();
			sc.nextLine();
			
			System.out.println();
			if(idades[i] < maisNovo) maisNovo = idades[i];
			
		}
		
		System.out.println(maisNovo);
		
		sc.close();

	}

}
