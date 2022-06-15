package atividade_;

import java.util.*;

public class Atividade13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira a temperatura em celsius:");
		float C = sc.nextFloat();
		
		float F = (9 * C + 160) / 5;
		
		System.out.printf("Insira a temperatura em fahrenheit: %.2f", F);
		
		sc.close();

	}

}
