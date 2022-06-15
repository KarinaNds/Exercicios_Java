package atividade_;

import java.util.*;

public class Atividade17 {

	public static void main(String[] args) {
		
	        Scanner sc = new Scanner(System.in);
	        
	        int idades[] = new int[20];
	        int maiores = 0;
	        
	        for (int idade : idades) {
	        	System.out.println("Insira uma idade:");
	        	idade = sc.nextInt();
	        	
	        	if (idade >= 18) {
	        		maiores++;
	        		
	        	}
	        }
	        
	        System.out.println(maiores);
	        
	}

	}


