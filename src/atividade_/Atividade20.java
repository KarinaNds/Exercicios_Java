package atividade_;

import java.util.Scanner;

public class Atividade20 {

	public static void main(String[] args) {
		
		int num;
        int cont = 0;
 
        for (int i = 1; i <= 20; i++) {
        	
        	System.out.println("Informe um numero:");
        	Scanner sc = new Scanner(System.in);
        	num = sc.nextInt();
        	
        	if(num >= 8) {
        		cont = cont + 1;
        	}
        }
        
        System.out.println("A quantidade de número maiores que 8 é " + cont);
	}

}
