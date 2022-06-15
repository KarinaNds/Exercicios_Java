package atividade_;

import java.util.*;

public class Atividade22 {

	public static void main(String[] args) {
		
		int num;
        int cont = 0;
 
        for (int i = 1; i <= 20; i++) {
 
        	System.out.println("Informe um número:");
        	Scanner sc = new Scanner(System.in);
            num = sc.nextInt();
 
            if (num > 0 && num <= 100) {
                cont = cont + 1;
            }
        }
 
        System.out.println("A quantidade de número entre 0 e 100 é " + cont);
        
	}
}

